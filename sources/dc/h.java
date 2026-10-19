package dc;
public abstract class h extends Exception {
    public static final boolean f7933a;
    public static final StackTraceElement[] f7934b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f7933a = z10;
        f7934b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
