package kotlinx.coroutines;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.AwaitAll.AwaitAllNode;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

public abstract class JobKt {
    public static final Symbol RESUME_TOKEN = new Symbol("RESUME_TOKEN", 0);
    public static final Symbol DISPOSED_TASK = new Symbol("REMOVED_TASK", 0);
    public static final Symbol CLOSED_EMPTY = new Symbol("CLOSED_EMPTY", 0);
    public static final Symbol COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY", 0);
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN", 0);
    public static final Symbol COMPLETING_RETRY = new Symbol("COMPLETING_RETRY", 0);
    public static final Symbol TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL", 0);
    public static final Symbol SEALED = new Symbol("SEALED", 0);
    public static final Empty EMPTY_NEW = new Empty(false);
    public static final Empty EMPTY_ACTIVE = new Empty(true);

    public static CompletableDeferredImpl CompletableDeferred$default() {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl(true);
        completableDeferredImpl.initParentJob(null);
        return completableDeferredImpl;
    }

    public static final ContextScope CoroutineScope(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key.$$INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(new JobImpl());
        }
        return new ContextScope(coroutineContext);
    }

    public static DeferredCoroutine async$default(CoroutineScope coroutineScope, Function2 function2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        CoroutineContext coroutineContextFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), emptyCoroutineContext, true);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        if (coroutineContextFoldCopies != defaultScheduler && coroutineContextFoldCopies.get(ContinuationInterceptor.Key.$$INSTANCE) == null) {
            coroutineContextFoldCopies = coroutineContextFoldCopies.plus(defaultScheduler);
        }
        CoroutineStart coroutineStart2 = CoroutineStart.DEFAULT;
        DeferredCoroutine deferredCoroutine = new DeferredCoroutine(coroutineContextFoldCopies, true);
        deferredCoroutine.start(coroutineStart, deferredCoroutine, function2);
        return deferredCoroutine;
    }

    public static final Object awaitAll(Deferred[] deferredArr, SuspendLambda suspendLambda) {
        if (deferredArr.length == 0) {
            return EmptyList.INSTANCE;
        }
        AwaitAll awaitAll = new AwaitAll(deferredArr);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, zzjj.intercepted(suspendLambda));
        cancellableContinuationImpl.initCancellability();
        int length = deferredArr.length;
        AwaitAll.AwaitAllNode[] awaitAllNodeArr = new AwaitAll.AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            Deferred deferred = deferredArr[i];
            deferred.start();
            AwaitAll.AwaitAllNode awaitAllNode = awaitAll.new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.handle = invokeOnCompletion$default(deferred, false, awaitAllNode, 3);
            awaitAllNodeArr[i] = awaitAllNode;
        }
        AwaitAll.DisposeHandlersOnCancel disposeHandlersOnCancel = new AwaitAll.DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            AwaitAll.AwaitAllNode awaitAllNode2 = awaitAllNodeArr[i2];
            awaitAllNode2.getClass();
            AwaitAll.AwaitAllNode._disposer$volatile$FU.set(awaitAllNode2, disposeHandlersOnCancel);
        }
        if (CancellableContinuationImpl._state$volatile$FU.get(cancellableContinuationImpl) instanceof NotCompleted) {
            cancellableContinuationImpl.invokeOnCancellationImpl(disposeHandlersOnCancel);
        } else {
            disposeHandlersOnCancel.disposeAll();
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.get(Job.Key.$$INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static final Object coroutineScope(Function2 function2, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, continuation.getContext());
        Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objStartUndispatchedOrReturn;
    }

    public static final Object delay(long j, ContinuationImpl continuationImpl) {
        Unit unit = Unit.INSTANCE;
        if (j > 0) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, zzjj.intercepted(continuationImpl));
            cancellableContinuationImpl.initCancellability();
            if (j < Long.MAX_VALUE) {
                getDelay(cancellableContinuationImpl.context).scheduleResumeAfterDelay(j, cancellableContinuationImpl);
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return result;
            }
        }
        return unit;
    }

    public static final void ensureActive(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.$$INSTANCE);
        if (job != null && !job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final CoroutineContext foldCopies(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        CoroutineContextKt$foldCopies$1 coroutineContextKt$foldCopies$1 = CoroutineContextKt$foldCopies$1.INSTANCE$1;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, coroutineContextKt$foldCopies$1)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, coroutineContextKt$foldCopies$1)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new CoroutineContextKt$foldCopies$1(2, 2));
        Object objFold = coroutineContext2;
        if (zBooleanValue2) {
            objFold = coroutineContext2.fold(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.INSTANCE);
        }
        return coroutineContext3.plus((CoroutineContext) objFold);
    }

    public static final Delay getDelay(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key.$$INSTANCE);
        Delay delay = element instanceof Delay ? (Delay) element : null;
        return delay == null ? DefaultExecutorKt.DefaultDelay : delay;
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final CancellableContinuationImpl getOrCreateCancellableContinuation(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        if (!(continuation instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl(1, continuation);
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation._reusableCancellableContinuation$volatile$FU;
            Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
            Symbol symbol = AtomicKt.REUSABLE_CLAIMED;
            cancellableContinuationImpl = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(dispatchedContinuation, symbol);
                cancellableContinuationImpl2 = null;
                break;
            }
            if (obj instanceof CancellableContinuationImpl) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, symbol)) {
                        cancellableContinuationImpl2 = (CancellableContinuationImpl) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == obj);
            } else if (obj != symbol && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (cancellableContinuationImpl2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CancellableContinuationImpl._state$volatile$FU;
            Object obj2 = atomicReferenceFieldUpdater2.get(cancellableContinuationImpl2);
            if (!(obj2 instanceof CompletedContinuation) || ((CompletedContinuation) obj2).idempotentResume == null) {
                CancellableContinuationImpl._decisionAndIndex$volatile$FU.set(cancellableContinuationImpl2, 536870911);
                atomicReferenceFieldUpdater2.set(cancellableContinuationImpl2, Active.INSTANCE);
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                cancellableContinuationImpl2.detachChild$kotlinx_coroutines_core();
            }
            if (cancellableContinuationImpl != null) {
                return cancellableContinuationImpl;
            }
        }
        return new CancellableContinuationImpl(2, continuation);
    }

    public static final void handleCoroutineException(Throwable th, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
        try {
            AndroidExceptionPreHandler androidExceptionPreHandler = (AndroidExceptionPreHandler) coroutineContext.get(Job.Key.$$INSTANCE$1);
            if (androidExceptionPreHandler != null) {
                androidExceptionPreHandler.handleException(th);
            } else {
                AtomicKt.handleUncaughtCoroutineException(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ExceptionsKt.addSuppressed(runtimeException, th);
                th = runtimeException;
            }
            AtomicKt.handleUncaughtCoroutineException(th, coroutineContext);
        }
    }

    public static DisposableHandle invokeOnCompletion$default(Job job, boolean z, JobNode jobNode, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        return job instanceof JobSupport ? ((JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(z, z2, jobNode) : job.invokeOnCompletion(z, z2, new JobKt__JobKt$invokeOnCompletion$1(1, jobNode, InternalCompletionHandler.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final Object joinAll(Collection collection, ContinuationImpl continuationImpl) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Iterator it;
        if (continuationImpl instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuationImpl;
            int i = awaitKt$joinAll$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.label = i - Integer.MIN_VALUE;
            } else {
                awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuationImpl);
            }
        } else {
            awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuationImpl);
        }
        Object obj = awaitKt$joinAll$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = awaitKt$joinAll$3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = awaitKt$joinAll$3.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            Job job = (Job) it.next();
            awaitKt$joinAll$3.L$0 = it;
            awaitKt$joinAll$3.label = 1;
            if (job.join(awaitKt$joinAll$3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.INSTANCE;
    }

    public static StandaloneCoroutine launch$default(CoroutineScope coroutineScope, Function2 function2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        CoroutineContext coroutineContextFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), emptyCoroutineContext, true);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        if (coroutineContextFoldCopies != defaultScheduler && coroutineContextFoldCopies.get(ContinuationInterceptor.Key.$$INSTANCE) == null) {
            coroutineContextFoldCopies = coroutineContextFoldCopies.plus(defaultScheduler);
        }
        CoroutineStart coroutineStart2 = CoroutineStart.DEFAULT;
        StandaloneCoroutine standaloneCoroutine = new StandaloneCoroutine(coroutineContextFoldCopies, true);
        standaloneCoroutine.start(coroutineStart, standaloneCoroutine, function2);
        return standaloneCoroutine;
    }

    public static final Object recoverResult(Object obj) {
        return obj instanceof CompletedExceptionally ? ResultKt.createFailure(((CompletedExceptionally) obj).cause) : obj;
    }

    public static final void resume(CancellableContinuationImpl cancellableContinuationImpl, Continuation continuation, boolean z) {
        Object obj = CancellableContinuationImpl._state$volatile$FU.get(cancellableContinuationImpl);
        Throwable exceptionalResult$kotlinx_coroutines_core = cancellableContinuationImpl.getExceptionalResult$kotlinx_coroutines_core(obj);
        Object objCreateFailure = exceptionalResult$kotlinx_coroutines_core != null ? ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core) : cancellableContinuationImpl.getSuccessfulResult$kotlinx_coroutines_core(obj);
        if (!z) {
            continuation.resumeWith(objCreateFailure);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        ContinuationImpl continuationImpl = dispatchedContinuation.continuation;
        CoroutineContext context = continuationImpl.getContext();
        Object objUpdateThreadContext = AtomicKt.updateThreadContext(context, dispatchedContinuation.countOrElement);
        UndispatchedCoroutine undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != AtomicKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(continuationImpl, context, objUpdateThreadContext) : null;
        try {
            continuationImpl.resumeWith(objCreateFailure);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                AtomicKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public static final String toDebugString(Continuation continuation) {
        Object objCreateFailure;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            objCreateFailure = continuation + '@' + getHexAddress(continuation);
        } catch (Throwable th) {
            objCreateFailure = ResultKt.createFailure(th);
        }
        if (Result.m139exceptionOrNullimpl(objCreateFailure) != null) {
            objCreateFailure = continuation.getClass().getName() + '@' + getHexAddress(continuation);
        }
        return (String) objCreateFailure;
    }

    public static final Object unboxState(Object obj) {
        Incomplete incomplete;
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.state) == null) ? obj : incomplete;
    }

    public static final UndispatchedCoroutine updateUndispatchedCompletion(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        UndispatchedCoroutine undispatchedCoroutine = null;
        if ((continuation instanceof CoroutineStackFrame) && coroutineContext.get(UndispatchedMarker.INSTANCE) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (!(callerFrame instanceof DispatchedCoroutine) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof UndispatchedCoroutine) {
                    undispatchedCoroutine = (UndispatchedCoroutine) callerFrame;
                    break;
                }
            }
            if (undispatchedCoroutine != null) {
                undispatchedCoroutine.saveThreadContext(coroutineContext, obj);
            }
        }
        return undispatchedCoroutine;
    }

    public static final Object withContext(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Object objUnboxState;
        CoroutineContext context = continuation.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, CoroutineContextKt$foldCopies$1.INSTANCE$1)).booleanValue() ? context.plus(coroutineContext) : foldCopies(context, coroutineContext, false);
        ensureActive(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, coroutineContextPlus);
            objUnboxState = UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key.$$INSTANCE;
            if (Intrinsics.areEqual(coroutineContextPlus.get(key), context.get(key))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(continuation, coroutineContextPlus);
                CoroutineContext coroutineContext2 = undispatchedCoroutine.context;
                Object objUpdateThreadContext = AtomicKt.updateThreadContext(coroutineContext2, null);
                try {
                    Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, function2);
                    AtomicKt.restoreThreadContext(coroutineContext2, objUpdateThreadContext);
                    objUnboxState = objStartUndispatchedOrReturn;
                } catch (Throwable th) {
                    AtomicKt.restoreThreadContext(coroutineContext2, objUpdateThreadContext);
                    throw th;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(continuation, coroutineContextPlus);
                CancellableKt.startCoroutineCancellable$default(function2, dispatchedCoroutine, dispatchedCoroutine);
                do {
                    atomicIntegerFieldUpdater = DispatchedCoroutine._decision$volatile$FU;
                    int i = atomicIntegerFieldUpdater.get(dispatchedCoroutine);
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objUnboxState = unboxState(dispatchedCoroutine.getState$kotlinx_coroutines_core());
                        if (objUnboxState instanceof CompletedExceptionally) {
                            throw ((CompletedExceptionally) objUnboxState).cause;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(dispatchedCoroutine, 0, 1));
                objUnboxState = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objUnboxState;
    }

    public static final Object withTimeout(long j, Function2 function2, Continuation continuation) throws Throwable {
        Object completedExceptionally;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        TimeoutCoroutine timeoutCoroutine = new TimeoutCoroutine(j, continuation);
        invokeOnCompletion$default(timeoutCoroutine, false, new InvokeOnCompletion(getDelay(timeoutCoroutine.uCont.getContext()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.context), 1), 3);
        try {
            TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
            completedExceptionally = function2.invoke(timeoutCoroutine, timeoutCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false);
        }
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (completedExceptionally == obj || (objMakeCompletingOnce$kotlinx_coroutines_core = timeoutCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) == COMPLETING_WAITING_CHILDREN) {
            return obj;
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            Throwable th2 = ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != timeoutCoroutine) {
                throw th2;
            }
            if (completedExceptionally instanceof CompletedExceptionally) {
                throw ((CompletedExceptionally) completedExceptionally).cause;
            }
        } else {
            completedExceptionally = unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return completedExceptionally;
    }

    public static final java.lang.Object joinAll(kotlinx.coroutines.Job[] r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobKt.joinAll(kotlinx.coroutines.Job[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
