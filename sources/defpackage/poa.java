package defpackage;
public abstract class poa {
    public static final int a = 0;

    static {
        Object sc9Var;
        Object sc9Var2;
        Exception exc = new Exception();
        String simpleName = c1d.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            sc9Var = og0.class.getCanonicalName();
        } catch (Throwable th) {
            sc9Var = new sc9(th);
        }
        if (tc9.a(sc9Var) != null) {
            sc9Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) sc9Var;
        try {
            sc9Var2 = poa.class.getCanonicalName();
        } catch (Throwable th2) {
            sc9Var2 = new sc9(th2);
        }
        if (tc9.a(sc9Var2) != null) {
            sc9Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) sc9Var2;
    }
}
