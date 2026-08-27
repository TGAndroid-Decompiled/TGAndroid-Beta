package lb;

public abstract class h extends Exception {

    public static final boolean f15522a;

    public static final StackTraceElement[] f15523b;

    static {
        f15522a = System.getProperty("surefire.test.class.path") != null;
        f15523b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
