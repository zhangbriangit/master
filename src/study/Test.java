package study;

class test {
//test:12
}

//12.Output of the below Java Code?
class Base {
	public final void show() {
		System.out.println("Base::show() called");
	}
}

class Derived extends Base {
	public void show1() {
		System.out.println("Derived::show() called");
	}
}

//public 
class Main1 {
	public static void main(String[] args) {
		Base b = new Derived();		;
		b.show();
	}
}
