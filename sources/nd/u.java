package nd;

import h7.k6;

public abstract class u {

    public static final int f18507a = 0;

    static {
        Object objA;
        Object objA2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objA = tc.a.class.getCanonicalName();
        } catch (Throwable th) {
            objA = k6.a(th);
        }
        if (pc.f.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            objA2 = k6.a(th2);
        }
        if (pc.f.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
