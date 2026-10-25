package ec;
public abstract class h extends Exception {
    public static final boolean f9886a;
    public static final StackTraceElement[] f9887b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9886a = z10;
        f9887b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
