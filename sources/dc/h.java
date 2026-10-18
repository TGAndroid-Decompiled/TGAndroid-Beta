package dc;
public abstract class h extends Exception {
    public static final boolean f7936a;
    public static final StackTraceElement[] f7937b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f7936a = z10;
        f7937b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
