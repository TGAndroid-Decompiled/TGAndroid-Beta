package cc;
public abstract class h extends Exception {
    public static final boolean f4623a;
    public static final StackTraceElement[] f4624b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4623a = z10;
        f4624b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
