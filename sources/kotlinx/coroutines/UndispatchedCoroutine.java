package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;

    public final void saveThreadContext(CoroutineContext coroutineContext, Object obj) {
        this.threadStateToRecover.set(TuplesKt.to(coroutineContext, obj));
    }

    public final boolean clearThreadContext() {
        if (this.threadStateToRecover.get() == null) {
            return false;
        }
        this.threadStateToRecover.set(null);
        return true;
    }

    @Override
    protected void afterResume(Object obj) {
        Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
        if (pair != null) {
            ThreadContextKt.restoreThreadContext(pair.component1(), pair.component2());
            this.threadStateToRecover.set(null);
        }
        Object recoverResult = CompletionStateKt.recoverResult(obj, this.uCont);
        Continuation<T> continuation = this.uCont;
        CoroutineContext context = continuation.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(continuation, context, updateThreadContext) : null;
        try {
            this.uCont.resumeWith(recoverResult);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        }
    }
}
