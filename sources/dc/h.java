package dc;
public abstract class h extends Exception {
    public static final boolean f6480a;
    public static final StackTraceElement[] f6481b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f6480a = z10;
        f6481b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
