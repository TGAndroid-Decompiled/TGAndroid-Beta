package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
public final class CoroutineContextKt {
    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (continuation instanceof CoroutineStackFrame) {
            if (coroutineContext.get(UndispatchedMarker.INSTANCE) != null) {
                UndispatchedCoroutine<?> undispatchedCompletion = undispatchedCompletion((CoroutineStackFrame) continuation);
                if (undispatchedCompletion != null) {
                    undispatchedCompletion.saveThreadContext(coroutineContext, obj);
                }
                return undispatchedCompletion;
            }
            return null;
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final String getCoroutineName(CoroutineContext coroutineContext) {
        CoroutineId coroutineId;
        String name;
        if (DebugKt.getDEBUG() && (coroutineId = (CoroutineId) coroutineContext.get(CoroutineId.Key)) != null) {
            CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
            String str = "coroutine";
            if (coroutineName != null && (name = coroutineName.getName()) != null) {
                str = name;
            }
            return str + '#' + coroutineId.getId();
        }
        return null;
    }
}
