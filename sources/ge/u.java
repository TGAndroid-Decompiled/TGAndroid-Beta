package ge;

import v7.i8;
public abstract class u {
    public static final int f11042a = 0;

    static {
        Object a2;
        Object a10;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = md.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a2 = i8.a(th2);
        }
        if (id.f.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) a2;
        try {
            a10 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            a10 = i8.a(th3);
        }
        if (id.f.a(a10) != null) {
            a10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) a10;
    }
}
