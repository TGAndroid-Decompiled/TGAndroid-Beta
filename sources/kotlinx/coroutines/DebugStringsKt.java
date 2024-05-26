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
        String m156constructorimpl;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m156constructorimpl = Result.m156constructorimpl(continuation + '@' + getHexAddress(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m156constructorimpl = Result.m156constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m157exceptionOrNullimpl(m156constructorimpl) != null) {
            m156constructorimpl = ((Object) continuation.getClass().getName()) + '@' + getHexAddress(continuation);
        }
        return (String) m156constructorimpl;
    }

    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
