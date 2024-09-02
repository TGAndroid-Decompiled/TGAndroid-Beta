package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

public final class DebugStringsKt {
    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(Continuation<?> continuation) {
        Object m150constructorimpl;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m150constructorimpl = Result.m150constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m150constructorimpl = Result.m150constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m151exceptionOrNullimpl(m150constructorimpl) != null) {
            m150constructorimpl = ((Object) continuation.getClass().getName()) + '@' + getHexAddress(continuation);
        }
        return (String) m150constructorimpl;
    }

    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
