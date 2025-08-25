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
        Object m211constructorimpl;
        Object m211constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m211constructorimpl = Result.m211constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m211constructorimpl = Result.m211constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m213exceptionOrNullimpl(m211constructorimpl) != null) {
            m211constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m211constructorimpl;
        try {
            m211constructorimpl2 = Result.m211constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m211constructorimpl2 = Result.m211constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m213exceptionOrNullimpl(m211constructorimpl2) != null) {
            m211constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m211constructorimpl2;
    }
}
