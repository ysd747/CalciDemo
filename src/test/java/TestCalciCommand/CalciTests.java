package TestCalciCommand;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import SimpleCalci.Addition;
import SimpleCalci.Division;
import SimpleCalci.Multiple;
import SimpleCalci.Substration;

public class CalciTests {

	@Test
	public void test() {
		int x = 1500;
		 int y = 200;
		 int expectedResult = 1700;
		 long result = Addition.add(x, y);
		 assertEquals(expectedResult, result);;
	}

	@Test
	public void testB() {
		int x = 25;
		 int y = 20;
		 int expectedResult = 5;
		 long result = Substration.sub(x, y);
		 assertEquals(expectedResult, result);;
	}

	@Test
	public void testC() {
		int x = 5;
		 int y = 5;
		 int expectedResult = 25;
		 long result = Multiple.mul(x, y);
		 assertEquals(expectedResult, result);;
	}
	
	@Test
	public void testD() {
		int x = 15;
		 int y = 3;
		 int expectedResult = 5;
		 long result = Division.div(x, y);
		 assertEquals(expectedResult, result);;
	}
}
