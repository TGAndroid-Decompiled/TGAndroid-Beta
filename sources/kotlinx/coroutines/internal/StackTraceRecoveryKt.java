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
        Object objM283constructorimpl;
        Object objM283constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM283constructorimpl = Result.m283constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM283constructorimpl = Result.m283constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m285exceptionOrNullimpl(objM283constructorimpl) != null) {
            objM283constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        baseContinuationImplClassName = (String) objM283constructorimpl;
        try {
            objM283constructorimpl2 = Result.m283constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM283constructorimpl2 = Result.m283constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m285exceptionOrNullimpl(objM283constructorimpl2) != null) {
            objM283constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        stackTraceRecoveryClassName = (String) objM283constructorimpl2;
    }
}
