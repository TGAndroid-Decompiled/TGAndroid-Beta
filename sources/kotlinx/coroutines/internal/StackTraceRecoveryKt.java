package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

public abstract class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineBoundary();
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClassName;

    public static final Throwable recoverStackTrace(Throwable th) {
        return th;
    }

    static {
        Object objM275constructorimpl;
        Object objM275constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM275constructorimpl = Result.m275constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM275constructorimpl = Result.m275constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m277exceptionOrNullimpl(objM275constructorimpl) != null) {
            objM275constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) objM275constructorimpl;
        try {
            objM275constructorimpl2 = Result.m275constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM275constructorimpl2 = Result.m275constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m277exceptionOrNullimpl(objM275constructorimpl2) != null) {
            objM275constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) objM275constructorimpl2;
    }
}
