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
        Object objM277constructorimpl;
        Object objM277constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM277constructorimpl = Result.m277constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM277constructorimpl = Result.m277constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m279exceptionOrNullimpl(objM277constructorimpl) != null) {
            objM277constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) objM277constructorimpl;
        try {
            objM277constructorimpl2 = Result.m277constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM277constructorimpl2 = Result.m277constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m279exceptionOrNullimpl(objM277constructorimpl2) != null) {
            objM277constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) objM277constructorimpl2;
    }
}
