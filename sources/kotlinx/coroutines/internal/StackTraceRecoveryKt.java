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
        Object m228constructorimpl;
        Object m228constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m228constructorimpl = Result.m228constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m228constructorimpl = Result.m228constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m230exceptionOrNullimpl(m228constructorimpl) != null) {
            m228constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m228constructorimpl;
        try {
            m228constructorimpl2 = Result.m228constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m228constructorimpl2 = Result.m228constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m230exceptionOrNullimpl(m228constructorimpl2) != null) {
            m228constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m228constructorimpl2;
    }
}
