package dc;
public abstract class h extends Exception {
    public static final boolean f6477a;
    public static final StackTraceElement[] f6478b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f6477a = z10;
        f6478b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
