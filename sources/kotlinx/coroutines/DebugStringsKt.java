package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

public abstract class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(Continuation continuation) {
        Object m209constructorimpl;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m209constructorimpl = Result.m209constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m209constructorimpl = Result.m209constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m211exceptionOrNullimpl(m209constructorimpl) != null) {
            m209constructorimpl = continuation.getClass().getName() + '@' + getHexAddress(continuation);
        }
        return (String) m209constructorimpl;
    }
}
