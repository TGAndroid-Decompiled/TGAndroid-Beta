package kotlinx.coroutines.internal;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CompletedWithCancellation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoopImplPlatform;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.ThreadLocalEventLoop;

public final class DispatchedContinuation extends DispatchedTask implements CoroutineStackFrame, Continuation {
    public static final AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final ContinuationImpl continuation;
    public final Object countOrElement;
    public final CoroutineDispatcher dispatcher;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, ContinuationImpl continuationImpl) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = continuationImpl;
        this._state = AtomicKt.UNDEFINED;
        Object objFold = continuationImpl.getContext().fold(0, ThreadContextKt$findOne$1.INSTANCE$1);
        Intrinsics.checkNotNull(objFold);
        this.countOrElement = objFold;
    }

    @Override
    public final void cancelCompletedResult$kotlinx_coroutines_core(Object obj, CancellationException cancellationException) {
        if (obj instanceof CompletedWithCancellation) {
            ((CompletedWithCancellation) obj).getClass();
            throw null;
        }
    }

    @Override
    public final CoroutineStackFrame getCallerFrame() {
        ContinuationImpl continuationImpl = this.continuation;
        if (Fragment$$ExternalSyntheticOutline0.m82m((Object) continuationImpl)) {
            return continuationImpl;
        }
        return null;
    }

    @Override
    public final CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override
    public final void resumeWith(Object obj) {
        ContinuationImpl continuationImpl = this.continuation;
        CoroutineContext context = continuationImpl.getContext();
        Throwable thM144exceptionOrNullimpl = Result.m144exceptionOrNullimpl(obj);
        Object completedExceptionally = thM144exceptionOrNullimpl == null ? obj : new CompletedExceptionally(thM144exceptionOrNullimpl, false);
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        if (coroutineDispatcher.isDispatchNeeded()) {
            this._state = completedExceptionally;
            this.resumeMode = 0;
            coroutineDispatcher.dispatch(context, this);
            return;
        }
        EventLoopImplPlatform eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.useCount >= 4294967296L) {
            this._state = completedExceptionally;
            this.resumeMode = 0;
            ArrayDeque arrayDeque = eventLoop$kotlinx_coroutines_core.unconfinedQueue;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                eventLoop$kotlinx_coroutines_core.unconfinedQueue = arrayDeque;
            }
            arrayDeque.addLast(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            CoroutineContext context2 = continuationImpl.getContext();
            Object objUpdateThreadContext = AtomicKt.updateThreadContext(context2, this.countOrElement);
            try {
                continuationImpl.resumeWith(obj);
                AtomicKt.restoreThreadContext(context2, objUpdateThreadContext);
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } catch (Throwable th) {
                AtomicKt.restoreThreadContext(context2, objUpdateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                handleFatalException$kotlinx_coroutines_core(th2, null);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    @Override
    public final Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = AtomicKt.UNDEFINED;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + JobKt.toDebugString(this.continuation) + ']';
    }
}
