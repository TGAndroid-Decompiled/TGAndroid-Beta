package od;

import i7.c7;
public abstract class v {
    public static final int f19537a = 0;

    static {
        Object a2;
        Object a10;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = uc.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a2 = c7.a(th2);
        }
        if (qc.f.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) a2;
        try {
            a10 = v.class.getCanonicalName();
        } catch (Throwable th3) {
            a10 = c7.a(th3);
        }
        if (qc.f.a(a10) != null) {
            a10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) a10;
    }
}
