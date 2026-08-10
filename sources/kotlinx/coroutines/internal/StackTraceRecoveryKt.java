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
        Object objM291constructorimpl;
        Object objM291constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM291constructorimpl = Result.m291constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM291constructorimpl = Result.m291constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m293exceptionOrNullimpl(objM291constructorimpl) != null) {
            objM291constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) objM291constructorimpl;
        try {
            objM291constructorimpl2 = Result.m291constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM291constructorimpl2 = Result.m291constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m293exceptionOrNullimpl(objM291constructorimpl2) != null) {
            objM291constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) objM291constructorimpl2;
    }
}
