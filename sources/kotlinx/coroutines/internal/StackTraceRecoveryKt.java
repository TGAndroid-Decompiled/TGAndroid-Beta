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
        Object m216constructorimpl;
        Object m216constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m216constructorimpl = Result.m216constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m216constructorimpl = Result.m216constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m218exceptionOrNullimpl(m216constructorimpl) != null) {
            m216constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) m216constructorimpl;
        try {
            m216constructorimpl2 = Result.m216constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m216constructorimpl2 = Result.m216constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m218exceptionOrNullimpl(m216constructorimpl2) != null) {
            m216constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) m216constructorimpl2;
    }
}
