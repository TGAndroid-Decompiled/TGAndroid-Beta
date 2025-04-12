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
        Object m210constructorimpl;
        Object m210constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m210constructorimpl = Result.m210constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m210constructorimpl = Result.m210constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m212exceptionOrNullimpl(m210constructorimpl) != null) {
            m210constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m210constructorimpl;
        try {
            m210constructorimpl2 = Result.m210constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m210constructorimpl2 = Result.m210constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m212exceptionOrNullimpl(m210constructorimpl2) != null) {
            m210constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m210constructorimpl2;
    }

    public static final Throwable recoverStackTrace(Throwable th) {
        return th;
    }
}
