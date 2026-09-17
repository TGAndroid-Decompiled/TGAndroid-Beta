package cc;
public abstract class h extends Exception {
    public static final boolean f4209a;
    public static final StackTraceElement[] f4210b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4209a = z10;
        f4210b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
