package dc;
public abstract class h extends Exception {
    public static final boolean f7935a;
    public static final StackTraceElement[] f7936b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f7935a = z10;
        f7936b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
