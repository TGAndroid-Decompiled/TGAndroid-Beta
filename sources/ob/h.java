package ob;
public abstract class h extends Exception {
    public static final boolean f16698a;
    public static final StackTraceElement[] f16699b;

    static {
        boolean z4;
        if (System.getProperty("surefire.test.class.path") != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        f16698a = z4;
        f16699b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
