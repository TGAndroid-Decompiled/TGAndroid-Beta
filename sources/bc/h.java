package bc;
public abstract class h extends Exception {
    public static final boolean f3096a;
    public static final StackTraceElement[] f3097b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3096a = z10;
        f3097b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
