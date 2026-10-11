package fe;

import v7.a8;
public abstract class u {
    public static final int f9915a = 0;

    static {
        Object a2;
        Object a10;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = ld.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a2 = a8.a(th2);
        }
        if (hd.f.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) a2;
        try {
            a10 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            a10 = a8.a(th3);
        }
        if (hd.f.a(a10) != null) {
            a10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) a10;
    }
}
