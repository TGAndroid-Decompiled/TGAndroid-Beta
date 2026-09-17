package cc;
public abstract class h extends Exception {
    public static final boolean f4740a;
    public static final StackTraceElement[] f4741b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4740a = z10;
        f4741b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
