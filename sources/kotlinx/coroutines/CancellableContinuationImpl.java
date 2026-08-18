package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

public class CancellableContinuationImpl extends DispatchedTask implements CancellableContinuation, CoroutineStackFrame, Waiter {
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    private final CoroutineContext context;
    private final Continuation delegate;
    private static final AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    private static final AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    private static final AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");

    @Override
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    public CancellableContinuationImpl(Continuation continuation, int i) {
        super(i);
        this.delegate = continuation;
        this.context = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.INSTANCE;
    }

    @Override
    public CoroutineContext getContext() {
        return this.context;
    }

    private final DisposableHandle getParentHandle() {
        return (DisposableHandle) _parentHandle$volatile$FU.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    @Override
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof NotCompleted) {
            return "Active";
        }
        return state$kotlinx_coroutines_core instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    public void initCancellability() {
        DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle != null && isCompleted()) {
            disposableHandleInstallParentHandle.dispose();
            _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    private final boolean isReusable() {
        if (DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            Continuation continuation = this.delegate;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core()) {
                return true;
            }
        }
        return false;
    }

    public final boolean resetStateReusable() {
        Object obj = _state$volatile$FU.get(this);
        if (!(obj instanceof CompletedContinuation) || ((CompletedContinuation) obj).idempotentResume == null) {
            _decisionAndIndex$volatile$FU.set(this, 536870911);
            _state$volatile$FU.set(this, Active.INSTANCE);
            return true;
        }
        detachChild$kotlinx_coroutines_core();
        return false;
    }

    @Override
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    @Override
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof CompletedExceptionally) {
                return;
            }
            if (obj2 instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                if (completedContinuation.getCancelled()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, CompletedContinuation.copy$default(completedContinuation, null, null, null, null, th, 15, null))) {
                    completedContinuation.invokeHandlers(this, th);
                    return;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, new CompletedContinuation(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    private final boolean cancelLater(Throwable th) {
        if (!isReusable()) {
            return false;
        }
        Continuation continuation = this.delegate;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(th);
    }

    @Override
    public boolean cancel(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, new CancelledContinuation(this, th, (obj instanceof CancelHandler) || (obj instanceof Segment))));
        NotCompleted notCompleted = (NotCompleted) obj;
        if (notCompleted instanceof CancelHandler) {
            callCancelHandler((CancelHandler) obj, th);
        } else if (notCompleted instanceof Segment) {
            callSegmentOnCancellation((Segment) obj, th);
        }
        detachChildIfNonResuable();
        dispatchResume(this.resumeMode);
        return true;
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable th) {
        if (cancelLater(th)) {
            return;
        }
        cancel(th);
        detachChildIfNonResuable();
    }

    public final void callCancelHandler(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void callSegmentOnCancellation(Segment segment, Throwable th) {
        int i = _decisionAndIndex$volatile$FU.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.onCancellation(i, th, getContext());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void callOnCancellation(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public Throwable getContinuationCancellationCause(Job job) {
        return job.getCancellationException();
    }

    private final boolean trySuspend() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    private final boolean tryResume() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    public final Object getResult() {
        Job job;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        if (DispatchedTaskKt.isCancellableMode(this.resumeMode) && (job = (Job) getContext().get(Job.Key)) != null && !job.isActive()) {
            CancellationException cancellationException = job.getCancellationException();
            cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
            throw cancellationException;
        }
        return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
    }

    private final DisposableHandle installParentHandle() {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt__JobKt.invokeOnCompletion$default(job, true, false, new ChildContinuation(this), 2, null);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_parentHandle$volatile$FU, this, null, disposableHandleInvokeOnCompletion$default);
        return disposableHandleInvokeOnCompletion$default;
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    @Override
    public void resumeWith(Object obj) {
        resumeImpl$default(this, CompletionStateKt.toState(obj, this), this.resumeMode, null, 4, null);
    }

    @Override
    public void resume(Object obj, Function1 function1) {
        resumeImpl(obj, this.resumeMode, function1);
    }

    @Override
    public void invokeOnCancellation(Segment segment, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        invokeOnCancellationImpl(segment);
    }

    @Override
    public void invokeOnCancellation(Function1 function1) {
        CancellableContinuationKt.invokeOnCancellation(this, new CancelHandler.UserSupplied(function1));
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(CancelHandler cancelHandler) {
        invokeOnCancellationImpl(cancelHandler);
    }

    private final void invokeOnCancellationImpl(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Active) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof CancelHandler ? true : obj2 instanceof Segment) {
                    multipleHandlersError(obj, obj2);
                } else {
                    if (obj2 instanceof CompletedExceptionally) {
                        CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                        if (!completedExceptionally.makeHandled()) {
                            multipleHandlersError(obj, obj2);
                        }
                        if (obj2 instanceof CancelledContinuation) {
                            if (!(obj2 instanceof CompletedExceptionally)) {
                                completedExceptionally = null;
                            }
                            Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
                            if (obj instanceof CancelHandler) {
                                callCancelHandler((CancelHandler) obj, th);
                                return;
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                callSegmentOnCancellation((Segment) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof CompletedContinuation) {
                        CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                        if (completedContinuation.cancelHandler != null) {
                            multipleHandlersError(obj, obj2);
                        }
                        if (obj instanceof Segment) {
                            return;
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        CancelHandler cancelHandler = (CancelHandler) obj;
                        if (completedContinuation.getCancelled()) {
                            callCancelHandler(cancelHandler, completedContinuation.cancelCause);
                            return;
                        } else {
                            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, CompletedContinuation.copy$default(completedContinuation, null, cancelHandler, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof Segment) {
                            return;
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, new CompletedContinuation(obj2, (CancelHandler) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final void multipleHandlersError(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void dispatchResume(int i) {
        if (tryResume()) {
            return;
        }
        DispatchedTaskKt.dispatch(this, i);
    }

    private final Object resumedState(NotCompleted notCompleted, Object obj, int i, Function1 function1, Object obj2) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (!DispatchedTaskKt.isCancellableMode(i) && obj2 == null) {
            return obj;
        }
        if (function1 == null && !(notCompleted instanceof CancelHandler) && obj2 == null) {
            return obj;
        }
        return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function1, obj2, null, 16, null);
    }

    private final void resumeImpl(Object obj, int i, Function1 function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
            } else {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    if (cancelledContinuation.makeResumed()) {
                        if (function1 != null) {
                            callOnCancellation(function1, cancelledContinuation.cause);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(obj);
                throw new KotlinNothingValueException();
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj2, resumedState((NotCompleted) obj2, obj, i, function1, null)));
        detachChildIfNonResuable();
        dispatchResume(i);
    }

    static void resumeImpl$default(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        cancellableContinuationImpl.resumeImpl(obj, i, function1);
    }

    private final Symbol tryResumeImpl(Object obj, Object obj2, Function1 function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof NotCompleted) {
            } else {
                if ((obj3 instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj3).idempotentResume == obj2) {
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
                return null;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj3, resumedState((NotCompleted) obj3, obj, this.resumeMode, function1, obj2)));
        detachChildIfNonResuable();
        return CancellableContinuationImplKt.RESUME_TOKEN;
    }

    private final Void alreadyResumedError(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void detachChildIfNonResuable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
    }

    @Override
    public Object tryResume(Object obj, Object obj2, Function1 function1) {
        return tryResumeImpl(obj, obj2, function1);
    }

    @Override
    public Object tryResumeWithException(Throwable th) {
        return tryResumeImpl(new CompletedExceptionally(th, false, 2, null), null, null);
    }

    @Override
    public void completeResume(Object obj) {
        dispatchResume(this.resumeMode);
    }

    @Override
    public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Object obj) {
        Continuation continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$default(this, obj, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override
    public Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof CompletedContinuation ? ((CompletedContinuation) obj).result : obj;
    }

    @Override
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public String toString() {
        return nameString() + '(' + DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    protected String nameString() {
        return "CancellableContinuation";
    }
}
