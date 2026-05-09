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
        Object objM307constructorimpl;
        Object objM307constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM307constructorimpl = Result.m307constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM307constructorimpl = Result.m307constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m309exceptionOrNullimpl(objM307constructorimpl) != null) {
            objM307constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) objM307constructorimpl;
        try {
            objM307constructorimpl2 = Result.m307constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM307constructorimpl2 = Result.m307constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m309exceptionOrNullimpl(objM307constructorimpl2) != null) {
            objM307constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) objM307constructorimpl2;
    }
}
