package md;

import g7.y5;
public abstract class u {
    public static final int f17671a = 0;

    static {
        Object a2;
        Object a3;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = sc.a.class.getCanonicalName();
        } catch (Throwable th) {
            a2 = y5.a(th);
        }
        if (oc.f.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) a2;
        try {
            a3 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            a3 = y5.a(th2);
        }
        if (oc.f.a(a3) != null) {
            a3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) a3;
    }
}
