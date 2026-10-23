package dc;
public abstract class h extends Exception {
    public static final boolean f7945a;
    public static final StackTraceElement[] f7946b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f7945a = z10;
        f7946b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
