package bc;
public abstract class h extends Exception {
    public static final boolean f3173a;
    public static final StackTraceElement[] f3174b;

    static {
        boolean z9;
        if (System.getProperty("surefire.test.class.path") != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        f3173a = z9;
        f3174b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
