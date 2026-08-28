package kb;
public abstract class h extends Exception {
    public static final boolean f14741a;
    public static final StackTraceElement[] f14742b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f14741a = z10;
        f14742b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
