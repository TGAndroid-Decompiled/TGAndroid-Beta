package ec;
public abstract class h extends Exception {
    public static final boolean f9885a;
    public static final StackTraceElement[] f9886b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9885a = z10;
        f9886b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
