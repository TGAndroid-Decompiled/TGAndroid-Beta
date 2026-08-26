package kotlinx.coroutines;

import androidx.car.app.HostException;
import com.google.common.base.Joiner;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;

public class CancellableContinuationImpl extends DispatchedTask implements CancellableContinuation, CoroutineStackFrame, Waiter {
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final CoroutineContext context;
    public final Continuation delegate;
    public static final AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");

    public CancellableContinuationImpl(int i, Continuation continuation) {
        super(i);
        this.delegate = continuation;
        this.context = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.INSTANCE;
    }

    public static void multipleHandlersError(NotCompleted notCompleted, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + notCompleted + ", already has " + obj).toString());
    }

    public static Object resumedState(NotCompleted notCompleted, Object obj, int i, Function1 function1) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (function1 != null || (notCompleted instanceof CancelHandler)) {
            return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function1, (CancellationException) null, 16);
        }
        return obj;
    }

    public final void callCancelHandler(CancelHandler cancelHandler, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            cancelHandler.invoke(th);
        } catch (Throwable th2) {
            JobKt.handleCoroutineException(new HostException("Exception in invokeOnCancellation handler for " + this, th2), this.context);
        }
    }

    public final void callOnCancellation(Function1 function1, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            JobKt.handleCoroutineException(new HostException("Exception in resume onCancellation handler for " + this, th2), this.context);
        }
    }

    public final void callSegmentOnCancellation(Segment segment, Throwable th) throws IllegalAccessException, InvocationTargetException {
        CoroutineContext coroutineContext = this.context;
        int i = _decisionAndIndex$volatile$FU.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.onCancellation(i, coroutineContext);
        } catch (Throwable th2) {
            JobKt.handleCoroutineException(new HostException("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final boolean cancel(Throwable th) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(this, th, (obj instanceof CancelHandler) || (obj instanceof Segment));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, cancelledContinuation)) {
                    NotCompleted notCompleted = (NotCompleted) obj;
                    if (notCompleted instanceof CancelHandler) {
                        callCancelHandler((CancelHandler) obj, th);
                    } else if (notCompleted instanceof Segment) {
                        callSegmentOnCancellation((Segment) obj, th);
                    }
                    if (!isReusable()) {
                        detachChild$kotlinx_coroutines_core();
                    }
                    dispatchResume(this.resumeMode);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override
    public final void cancelCompletedResult$kotlinx_coroutines_core(Object obj, CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof CompletedExceptionally) {
                return;
            }
            if (!(obj2 instanceof CompletedContinuation)) {
                cancellationException2 = cancellationException;
                CompletedContinuation completedContinuation = new CompletedContinuation(obj2, (CancelHandler) null, (Function1) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, completedContinuation)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj2;
            if (completedContinuation2.cancelCause != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, completedContinuationCopy$default)) {
                    CancelHandler cancelHandler = completedContinuation2.cancelHandler;
                    if (cancelHandler != null) {
                        callCancelHandler(cancelHandler, cancellationException);
                    }
                    Function1 function1 = completedContinuation2.onCancellation;
                    if (function1 != null) {
                        callOnCancellation(function1, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override
    public final void completeResume(Object obj) {
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _parentHandle$volatile$FU;
        DisposableHandle disposableHandle = (DisposableHandle) atomicReferenceFieldUpdater.get(this);
        if (disposableHandle == null) {
            return;
        }
        disposableHandle.dispose();
        atomicReferenceFieldUpdater.set(this, NonDisposableHandle.INSTANCE);
    }

    public final void dispatchResume(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                Continuation continuation = this.delegate;
                if (!z && (continuation instanceof DispatchedContinuation)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.resumeMode;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        CoroutineDispatcher coroutineDispatcher = ((DispatchedContinuation) continuation).dispatcher;
                        CoroutineContext context = ((DispatchedContinuation) continuation).continuation.getContext();
                        if (coroutineDispatcher.isDispatchNeeded()) {
                            coroutineDispatcher.dispatch(context, this);
                            return;
                        }
                        EventLoopImplPlatform eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
                        if (eventLoop$kotlinx_coroutines_core.useCount >= 4294967296L) {
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
                            JobKt.resume(this, continuation, true);
                            do {
                            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
                        } catch (Throwable th) {
                            try {
                                handleFatalException$kotlinx_coroutines_core(th, null);
                            } finally {
                                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                            }
                        }
                        return;
                    }
                }
                JobKt.resume(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override
    public final CoroutineContext getContext() {
        return this.context;
    }

    public Throwable getContinuationCancellationCause(JobSupport jobSupport) {
        return jobSupport.getCancellationException();
    }

    @Override
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override
    public final Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final Object getResult() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zIsReusable = isReusable();
        do {
            atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zIsReusable) {
                    releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                }
                Object obj = _state$volatile$FU.get(this);
                if (obj instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) obj).cause;
                }
                int i3 = this.resumeMode;
                if (i3 == 1 || i3 == 2) {
                    Job job = (Job) this.context.get(Job.Key.$$INSTANCE);
                    if (job != null && !job.isActive()) {
                        CancellationException cancellationException = job.getCancellationException();
                        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
                        throw cancellationException;
                    }
                }
                return getSuccessfulResult$kotlinx_coroutines_core(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((DisposableHandle) _parentHandle$volatile$FU.get(this)) == null) {
            installParentHandle();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override
    public final Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof CompletedContinuation ? ((CompletedContinuation) obj).result : obj;
    }

    public final void initCancellability() {
        DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle == null || (_state$volatile$FU.get(this) instanceof NotCompleted)) {
            return;
        }
        disposableHandleInstallParentHandle.dispose();
        _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
    }

    public final DisposableHandle installParentHandle() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Job job = (Job) this.context.get(Job.Key.$$INSTANCE);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt.invokeOnCompletion$default(job, true, new ChildContinuation(this), 2);
        do {
            atomicReferenceFieldUpdater = _parentHandle$volatile$FU;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleInvokeOnCompletion$default)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return disposableHandleInvokeOnCompletion$default;
    }

    @Override
    public final void invokeOnCancellation(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        invokeOnCancellationImpl(segment);
    }

    public final void invokeOnCancellationImpl(NotCompleted notCompleted) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Active) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, notCompleted)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof CancelHandler ? true : obj instanceof Segment) {
                multipleHandlersError(notCompleted, obj);
                throw null;
            }
            if (obj instanceof CompletedExceptionally) {
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                completedExceptionally.getClass();
                if (!CompletedExceptionally._handled$volatile$FU.compareAndSet(completedExceptionally, 0, 1)) {
                    multipleHandlersError(notCompleted, obj);
                    throw null;
                }
                if (obj instanceof CancelledContinuation) {
                    if (((CompletedExceptionally) obj) == null) {
                        completedExceptionally = null;
                    }
                    Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
                    if (notCompleted instanceof CancelHandler) {
                        callCancelHandler((CancelHandler) notCompleted, th);
                        return;
                    } else {
                        callSegmentOnCancellation((Segment) notCompleted, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof CompletedContinuation)) {
                if (notCompleted instanceof Segment) {
                    return;
                }
                CompletedContinuation completedContinuation = new CompletedContinuation(obj, (CancelHandler) notCompleted, (Function1) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuation)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj;
            if (completedContinuation2.cancelHandler != null) {
                multipleHandlersError(notCompleted, obj);
                throw null;
            }
            if (notCompleted instanceof Segment) {
                return;
            }
            CancelHandler cancelHandler = (CancelHandler) notCompleted;
            Throwable th2 = completedContinuation2.cancelCause;
            if (th2 != null) {
                callCancelHandler(cancelHandler, th2);
                return;
            }
            CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, cancelHandler, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuationCopy$default)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean isActive() {
        return _state$volatile$FU.get(this) instanceof NotCompleted;
    }

    public final boolean isReusable() {
        if (this.resumeMode != 2) {
            return false;
        }
        Continuation continuation = this.delegate;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return DispatchedContinuation._reusableCancellableContinuation$volatile$FU.get((DispatchedContinuation) continuation) != null;
    }

    public String nameString() {
        return "CancellableContinuation";
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() throws IllegalAccessException, InvocationTargetException {
        Continuation continuation = this.delegate;
        Throwable th = null;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation._reusableCancellableContinuation$volatile$FU;
                Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
                Joiner joiner = AtomicKt.REUSABLE_CLAIMED;
                if (obj != joiner) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, joiner, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == joiner);
            }
            if (th == null) {
                return;
            }
            detachChild$kotlinx_coroutines_core();
            cancel(th);
        }
    }

    public final void resume(Function1 function1, Object obj) throws IllegalAccessException, InvocationTargetException {
        resumeImpl(obj, this.resumeMode, function1);
    }

    public final void resumeImpl(Object obj, int i, Function1 function1) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    cancelledContinuation.getClass();
                    if (CancelledContinuation._resumed$volatile$FU.compareAndSet(cancelledContinuation, 0, 1)) {
                        if (function1 != null) {
                            callOnCancellation(function1, cancelledContinuation.cause);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objResumedState = resumedState((NotCompleted) obj2, obj, i, function1);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objResumedState)) {
                    if (!isReusable()) {
                        detachChild$kotlinx_coroutines_core();
                    }
                    dispatchResume(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void resumeUndispatched(CoroutineDispatcher coroutineDispatcher) {
        Unit unit = Unit.INSTANCE;
        Continuation continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl(unit, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null);
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable thM144exceptionOrNullimpl = Result.m144exceptionOrNullimpl(obj);
        if (thM144exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(thM144exceptionOrNullimpl, false);
        }
        resumeImpl(obj, this.resumeMode, null);
    }

    @Override
    public final Object takeState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(nameString());
        sb.append('(');
        sb.append(JobKt.toDebugString(this.delegate));
        sb.append("){");
        Object obj = _state$volatile$FU.get(this);
        if (obj instanceof NotCompleted) {
            str = "Active";
        } else {
            str = obj instanceof CancelledContinuation ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(JobKt.getHexAddress(this));
        return sb.toString();
    }

    @Override
    public final Joiner tryResume(Function1 function1, Object obj) {
        return tryResumeImpl(function1, obj);
    }

    public final Joiner tryResumeImpl(Function1 function1, Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof NotCompleted;
            Joiner joiner = JobKt.RESUME_TOKEN;
            if (!z) {
                boolean z2 = obj2 instanceof CompletedContinuation;
                return null;
            }
            Object objResumedState = resumedState((NotCompleted) obj2, obj, this.resumeMode, function1);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objResumedState)) {
                    if (!isReusable()) {
                        detachChild$kotlinx_coroutines_core();
                    }
                    return joiner;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void invokeOnCancellation(Function1 function1) {
        invokeOnCancellationImpl(new DisposeOnCancel(function1, 2));
    }
}
