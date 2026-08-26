package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

public final class UndispatchedCoroutine extends ScopeCoroutine {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal threadStateToRecover;

    public UndispatchedCoroutine(Continuation continuation, CoroutineContext coroutineContext) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.INSTANCE;
        super(continuation, coroutineContext.get(undispatchedMarker) == null ? coroutineContext.plus(undispatchedMarker) : coroutineContext);
        this.threadStateToRecover = new ThreadLocal();
        if (continuation.getContext().get(ContinuationInterceptor.Key.$$INSTANCE) instanceof CoroutineDispatcher) {
            return;
        }
        Object objUpdateThreadContext = AtomicKt.updateThreadContext(coroutineContext, null);
        AtomicKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
        saveThreadContext(coroutineContext, objUpdateThreadContext);
    }

    @Override
    public final void afterResume(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.threadStateToRecover.get();
            if (pair != null) {
                AtomicKt.restoreThreadContext((CoroutineContext) pair.first, pair.second);
            }
            this.threadStateToRecover.remove();
        }
        Object objRecoverResult = JobKt.recoverResult(obj);
        Continuation continuation = this.uCont;
        CoroutineContext context = continuation.getContext();
        Object objUpdateThreadContext = AtomicKt.updateThreadContext(context, null);
        UndispatchedCoroutine undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != AtomicKt.NO_THREAD_ELEMENTS ? JobKt.updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                AtomicKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    public final void saveThreadContext(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(new Pair(coroutineContext, obj));
    }
}
