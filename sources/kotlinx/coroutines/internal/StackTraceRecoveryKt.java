package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

public abstract class StackTraceRecoveryKt {
    public static final int $r8$clinit = 0;

    static {
        Object objCreateFailure;
        Object objCreateFailure2;
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        new StackTraceElement("_COROUTINE._BOUNDARY", "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objCreateFailure = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            objCreateFailure = ResultKt.createFailure(th);
        }
        if (Result.m144exceptionOrNullimpl(objCreateFailure) != null) {
            objCreateFailure = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objCreateFailure2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            objCreateFailure2 = ResultKt.createFailure(th2);
        }
        if (Result.m144exceptionOrNullimpl(objCreateFailure2) != null) {
            objCreateFailure2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
