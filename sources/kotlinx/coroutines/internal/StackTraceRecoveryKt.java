package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

public abstract class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineBoundary();
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClassName;

    static {
        Object m209constructorimpl;
        Object m209constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m209constructorimpl = Result.m209constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m209constructorimpl = Result.m209constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m211exceptionOrNullimpl(m209constructorimpl) != null) {
            m209constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m209constructorimpl;
        try {
            m209constructorimpl2 = Result.m209constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m209constructorimpl2 = Result.m209constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m211exceptionOrNullimpl(m209constructorimpl2) != null) {
            m209constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m209constructorimpl2;
    }

    public static final Throwable recoverStackTrace(Throwable th) {
        return th;
    }
}
