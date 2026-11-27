package defpackage;
public abstract class b59 extends Exception {
    public static final boolean a;
    public static final StackTraceElement[] b;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        a = z;
        b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
