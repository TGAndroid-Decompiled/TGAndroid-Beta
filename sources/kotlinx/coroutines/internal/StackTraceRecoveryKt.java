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
        Object m213constructorimpl;
        Object m213constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m213constructorimpl = Result.m213constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m213constructorimpl = Result.m213constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m215exceptionOrNullimpl(m213constructorimpl) != null) {
            m213constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m213constructorimpl;
        try {
            m213constructorimpl2 = Result.m213constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m213constructorimpl2 = Result.m213constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m215exceptionOrNullimpl(m213constructorimpl2) != null) {
            m213constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m213constructorimpl2;
    }
}
