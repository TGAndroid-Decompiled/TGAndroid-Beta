package mb;
public abstract class h extends Exception {
    public static final boolean f16962a;
    public static final StackTraceElement[] f16963b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f16962a = z10;
        f16963b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
