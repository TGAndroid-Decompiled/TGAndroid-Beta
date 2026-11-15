package bc;
public abstract class h extends Exception {
    public static final boolean f3128a;
    public static final StackTraceElement[] f3129b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3128a = z10;
        f3129b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
