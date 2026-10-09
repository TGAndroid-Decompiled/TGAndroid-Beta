package cc;
public abstract class h extends Exception {
    public static final boolean f4597a;
    public static final StackTraceElement[] f4598b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4597a = z10;
        f4598b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
