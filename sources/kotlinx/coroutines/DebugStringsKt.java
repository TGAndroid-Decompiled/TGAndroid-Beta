package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

public abstract class DebugStringsKt {
    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(Continuation continuation) {
        Object m211constructorimpl;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m211constructorimpl = Result.m211constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m211constructorimpl = Result.m211constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m213exceptionOrNullimpl(m211constructorimpl) != null) {
            m211constructorimpl = continuation.getClass().getName() + '@' + getHexAddress(continuation);
        }
        return (String) m211constructorimpl;
    }

    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
