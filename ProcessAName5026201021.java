import java.util.Scanner;

public class ProcessAName5026201021{
	
	public static void main(String[] args){
	Scanner Name1 = new Scanner(System.in);	
	System.out.println("Type your name: ");
	
	String Name2 = Name1.nextLine();
	int Space = Name2.indexOf(' ');

	String Format;
	Format= Name2.substring(Space + 1)+ "," + Name2.charAt(0)+ ".";

	System.out.println("Your name is: "+Format);
 }
}