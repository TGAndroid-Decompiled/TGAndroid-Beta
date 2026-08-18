package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause0Impl;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectInstance;

public class JobSupport implements Job, ChildJob, ParentJob {
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    private static final AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");
    private static final AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");

    protected void afterCompletion(Object obj) {
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    protected boolean handleJobException(Throwable th) {
        return false;
    }

    protected boolean isScopedCoroutine() {
        return false;
    }

    protected void onCancelling(Throwable th) {
    }

    protected void onCompletionInternal(Object obj) {
    }

    protected void onStart() {
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? JobSupportKt.EMPTY_ACTIVE : JobSupportKt.EMPTY_NEW;
    }

    @Override
    public void cancel() {
        cancel((CancellationException) null);
    }

    @Override
    public Object fold(Object obj, Function2 function2) {
        return Job.DefaultImpls.fold(this, obj, function2);
    }

    @Override
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return Job.DefaultImpls.get(this, key);
    }

    @Override
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return Job.DefaultImpls.minusKey(this, key);
    }

    @Override
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return Job.DefaultImpls.plus(this, coroutineContext);
    }

    @Override
    public Job plus(Job job) {
        return Job.DefaultImpls.plus((Job) this, job);
    }

    @Override
    public final CoroutineContext.Key getKey() {
        return Job.Key;
    }

    private final boolean addLastAtomic(final Object obj, NodeList nodeList, final JobNode jobNode) {
        int iTryCondAddNext;
        LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(jobNode) {
            @Override
            public Object prepare(LockFreeLinkedListNode lockFreeLinkedListNode) {
                if (this.getState$kotlinx_coroutines_core() == obj) {
                    return null;
                }
                return LockFreeLinkedListKt.getCONDITION_FALSE();
            }
        };
        do {
            iTryCondAddNext = nodeList.getPrevNode().tryCondAddNext(jobNode, nodeList, condAddOp);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (ChildHandle) _parentHandle$volatile$FU.get(this);
    }

    public final void setParentHandle$kotlinx_coroutines_core(ChildHandle childHandle) {
        _parentHandle$volatile$FU.set(this, childHandle);
    }

    @Override
    public Job getParent() {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    protected final void initParentJob(Job job) {
        if (job == null) {
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
            return;
        }
        job.start();
        ChildHandle childHandleAttachChild = job.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(childHandleAttachChild);
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
    }

    public final Object getState$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    private final Object cancelMakeCompleting(Object obj) {
        Object objTryMakeCompleting;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
            objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(createCauseException(obj), false, 2, null));
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    private final boolean joinInternal() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    private final Object makeCancelling(Object obj) throws Throwable {
        Throwable thCreateCauseException = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Finishing) {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((Finishing) state$kotlinx_coroutines_core).isSealed()) {
                        return JobSupportKt.TOO_LATE_TO_CANCEL;
                    }
                    boolean zIsCancelling = ((Finishing) state$kotlinx_coroutines_core).isCancelling();
                    if (obj != null || !zIsCancelling) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(obj);
                        }
                        ((Finishing) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                    }
                    Throwable rootCause = zIsCancelling ? null : ((Finishing) state$kotlinx_coroutines_core).getRootCause();
                    if (rootCause != null) {
                        notifyCancelling(((Finishing) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    return JobSupportKt.COMPLETING_ALREADY;
                }
            }
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return JobSupportKt.TOO_LATE_TO_CANCEL;
            }
            if (thCreateCauseException == null) {
                thCreateCauseException = createCauseException(obj);
            }
            Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core;
            if (incomplete.isActive()) {
                if (tryMakeCancelling(incomplete, thCreateCauseException)) {
                    return JobSupportKt.COMPLETING_ALREADY;
                }
            } else {
                Object objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(thCreateCauseException, false, 2, null));
                if (objTryMakeCompleting != JobSupportKt.COMPLETING_ALREADY) {
                    if (objTryMakeCompleting != JobSupportKt.COMPLETING_RETRY) {
                        return objTryMakeCompleting;
                    }
                } else {
                    throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                }
            }
        }
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                return false;
            }
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        afterCompletion(objTryMakeCompleting);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobSupportKt.COMPLETING_ALREADY) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, getExceptionOrNull(obj));
            }
        } while (objTryMakeCompleting == JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    public final void removeNode$kotlinx_coroutines_core(JobNode jobNode) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                jobNode.remove();
                return;
            }
            if (state$kotlinx_coroutines_core != jobNode) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, JobSupportKt.EMPTY_ACTIVE));
    }

    @Override
    public final boolean start() {
        int iStartInternal;
        do {
            iStartInternal = startInternal(getState$kotlinx_coroutines_core());
            if (iStartInternal == 0) {
                return false;
            }
        } while (iStartInternal != 1);
        return true;
    }

    @Override
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).isActive();
    }

    @Override
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    @Override
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof CompletedExceptionally) || ((state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCancelling());
    }

    private final Object finalizeFinishingState(Finishing finishing, Object obj) throws Throwable {
        boolean zIsCancelling;
        Throwable finalRootCause;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (finishing) {
            zIsCancelling = finishing.isCancelling();
            List listSealLocked = finishing.sealLocked(th);
            finalRootCause = getFinalRootCause(finishing, listSealLocked);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, listSealLocked);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            obj = new CompletedExceptionally(finalRootCause, false, 2, null);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((CompletedExceptionally) obj).makeHandled();
        }
        if (!zIsCancelling) {
            onCancelling(finalRootCause);
        }
        onCompletionInternal(obj);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, finishing, JobSupportKt.boxIncomplete(obj));
        completeStateFinalization(finishing, obj);
        return obj;
    }

    private final Throwable getFinalRootCause(Finishing finishing, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (finishing.isCancelling()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : list2) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final void addSuppressedExceptions(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                kotlin.ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    private final boolean tryFinalizeSimpleState(Incomplete incomplete, Object obj) throws Throwable {
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, incomplete, JobSupportKt.boxIncomplete(obj))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(obj);
        completeStateFinalization(incomplete, obj);
        return true;
    }

    private final void completeStateFinalization(Incomplete incomplete, Object obj) throws Throwable {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).invoke(th);
                return;
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        NodeList list = incomplete.getList();
        if (list != null) {
            notifyCompletion(list, th);
        }
    }

    private final Object joinSuspend(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, JobKt__JobKt.invokeOnCompletion$default(this, false, false, new ResumeOnCompletion(cancellableContinuationImpl), 3, null));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final void notifyCancelling(NodeList nodeList, Throwable th) throws Throwable {
        onCancelling(th);
        Object next = nodeList.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(nextNode, nodeList); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
        cancelParent(th);
    }

    private final void notifyCompletion(NodeList nodeList, Throwable th) throws Throwable {
        Object next = nodeList.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(nextNode, nodeList); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
    }

    private final boolean cancelParent(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == NonDisposableHandle.INSTANCE) {
            return z;
        }
        return parentHandle$kotlinx_coroutines_core.childCancelled(th) || z;
    }

    private final int startInternal(Object obj) {
        if (obj instanceof Empty) {
            if (((Empty) obj).isActive()) {
                return 0;
            }
            if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, JobSupportKt.EMPTY_ACTIVE)) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, ((InactiveNodeList) obj).getList())) {
            return -1;
        }
        onStart();
        return 1;
    }

    @Override
    public final CancellationException getCancellationException() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Finishing) {
            Throwable rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause != null) {
                CancellationException cancellationException = toCancellationException(rootCause, DebugStringsKt.getClassSimpleName(this) + " is cancelling");
                if (cancellationException != null) {
                    return cancellationException;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            return toCancellationException$default(this, ((CompletedExceptionally) state$kotlinx_coroutines_core).cause, null, 1, null);
        }
        return new JobCancellationException(DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
    }

    public static CancellationException toCancellationException$default(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return jobSupport.toCancellationException(th, str);
    }

    protected final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = cancellationExceptionMessage();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    @Override
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(false, true, new InternalCompletionHandler.UserSupplied(function1));
    }

    @Override
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z, z2, new InternalCompletionHandler.UserSupplied(function1));
    }

    public final DisposableHandle invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z, boolean z2, InternalCompletionHandler internalCompletionHandler) {
        JobNode jobNodeMakeNode = makeNode(internalCompletionHandler, z);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                if (empty.isActive()) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, state$kotlinx_coroutines_core, jobNodeMakeNode)) {
                        return jobNodeMakeNode;
                    }
                } else {
                    promoteEmptyToNodeList(empty);
                }
            } else {
                Throwable rootCause = null;
                if (state$kotlinx_coroutines_core instanceof Incomplete) {
                    NodeList list = ((Incomplete) state$kotlinx_coroutines_core).getList();
                    if (list == null) {
                        Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                    } else {
                        DisposableHandle disposableHandle = NonDisposableHandle.INSTANCE;
                        if (z && (state$kotlinx_coroutines_core instanceof Finishing)) {
                            synchronized (state$kotlinx_coroutines_core) {
                                try {
                                    rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
                                    if (rootCause == null || ((internalCompletionHandler instanceof ChildHandleNode) && !((Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                                        if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                                            if (rootCause == null) {
                                                return jobNodeMakeNode;
                                            }
                                            disposableHandle = jobNodeMakeNode;
                                        }
                                    }
                                    Unit unit = Unit.INSTANCE;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (rootCause != null) {
                            if (z2) {
                                internalCompletionHandler.invoke(rootCause);
                            }
                            return disposableHandle;
                        }
                        if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                            return jobNodeMakeNode;
                        }
                    }
                } else {
                    if (z2) {
                        CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core : null;
                        internalCompletionHandler.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    }
                    return NonDisposableHandle.INSTANCE;
                }
            }
        }
    }

    private final JobNode makeNode(InternalCompletionHandler internalCompletionHandler, boolean z) {
        JobNode invokeOnCompletion;
        if (z) {
            invokeOnCompletion = internalCompletionHandler instanceof JobCancellingNode ? (JobCancellingNode) internalCompletionHandler : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCancelling(internalCompletionHandler);
            }
        } else {
            invokeOnCompletion = internalCompletionHandler instanceof JobNode ? (JobNode) internalCompletionHandler : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCompletion(internalCompletionHandler);
            }
        }
        invokeOnCompletion.setJob(this);
        return invokeOnCompletion;
    }

    private final void promoteEmptyToNodeList(Empty empty) {
        NodeList nodeList = new NodeList();
        Object inactiveNodeList = nodeList;
        if (!empty.isActive()) {
            inactiveNodeList = new InactiveNodeList(nodeList);
        }
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, empty, inactiveNodeList);
    }

    private final void promoteSingleToNodeList(JobNode jobNode) {
        jobNode.addOneIfEmpty(new NodeList());
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, jobNode, jobNode.getNextNode());
    }

    @Override
    public final Object join(Continuation continuation) {
        if (!joinInternal()) {
            JobKt.ensureActive(continuation.getContext());
            return Unit.INSTANCE;
        }
        Object objJoinSuspend = joinSuspend(continuation);
        return objJoinSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoinSuspend : Unit.INSTANCE;
    }

    @Override
    public final SelectClause0 getOnJoin() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new SelectClause0Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onJoin$1, 3), null, 4, null);
    }

    public final void registerSelectForOnJoin(SelectInstance selectInstance, Object obj) {
        if (!joinInternal()) {
            selectInstance.selectInRegistrationPhase(Unit.INSTANCE);
        } else {
            selectInstance.disposeOnCompletion(JobKt__JobKt.invokeOnCompletion$default(this, false, false, new SelectOnJoinCompletionHandler(selectInstance), 3, null));
        }
    }

    private final class SelectOnJoinCompletionHandler extends JobNode {
        public SelectOnJoinCompletionHandler(SelectInstance selectInstance) {
        }

        @Override
        public void invoke(Throwable th) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    @Override
    public boolean cancel(Throwable th) throws Throwable {
        Throwable jobCancellationException;
        if (th == null || (jobCancellationException = toCancellationException$default(this, th, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    public void cancelInternal(Throwable th) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    @Override
    public final void parentCancelled(ParentJob parentJob) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) throws Throwable {
        Object objMakeCancelling = JobSupportKt.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (objMakeCancelling = cancelMakeCompleting(obj)) == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == JobSupportKt.COMPLETING_ALREADY) {
            objMakeCancelling = makeCancelling(obj);
        }
        if (objMakeCancelling == JobSupportKt.COMPLETING_ALREADY || objMakeCancelling == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == JobSupportKt.TOO_LATE_TO_CANCEL) {
            return false;
        }
        afterCompletion(objMakeCancelling);
        return true;
    }

    @Override
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override
    public CancellationException getChildJobCancellationCause() {
        Throwable rootCause;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Finishing) {
            rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            rootCause = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            rootCause = null;
        }
        CancellationException cancellationException = rootCause instanceof CancellationException ? (CancellationException) rootCause : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + stateString(state$kotlinx_coroutines_core), rootCause, this);
    }

    private final Throwable createCauseException(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(cancellationExceptionMessage(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).getChildJobCancellationCause();
    }

    private final NodeList getOrPromoteCancellingList(Incomplete incomplete) {
        NodeList list = incomplete.getList();
        if (list != null) {
            return list;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (incomplete instanceof JobNode) {
            promoteSingleToNodeList((JobNode) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    private final boolean tryMakeCancelling(Incomplete incomplete, Throwable th) throws Throwable {
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, incomplete, new Finishing(orPromoteCancellingList, false, th))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, th);
        return true;
    }

    private final Object tryMakeCompleting(Object obj, Object obj2) {
        if (!(obj instanceof Incomplete)) {
            return JobSupportKt.COMPLETING_ALREADY;
        }
        if ((!(obj instanceof Empty) && !(obj instanceof JobNode)) || (obj instanceof ChildHandleNode) || (obj2 instanceof CompletedExceptionally)) {
            return tryMakeCompletingSlowPath((Incomplete) obj, obj2);
        }
        return tryFinalizeSimpleState((Incomplete) obj, obj2) ? obj2 : JobSupportKt.COMPLETING_RETRY;
    }

    private final Object tryMakeCompletingSlowPath(Incomplete incomplete, Object obj) throws Throwable {
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return JobSupportKt.COMPLETING_RETRY;
        }
        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
        if (finishing == null) {
            finishing = new Finishing(orPromoteCancellingList, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (finishing) {
            if (finishing.isCompleting()) {
                return JobSupportKt.COMPLETING_ALREADY;
            }
            finishing.setCompleting(true);
            if (finishing != incomplete && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, incomplete, finishing)) {
                return JobSupportKt.COMPLETING_RETRY;
            }
            boolean zIsCancelling = finishing.isCancelling();
            CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            Throwable rootCause = zIsCancelling ? null : finishing.getRootCause();
            ref$ObjectRef.element = rootCause;
            Unit unit = Unit.INSTANCE;
            if (rootCause != null) {
                notifyCancelling(orPromoteCancellingList, rootCause);
            }
            ChildHandleNode childHandleNodeFirstChild = firstChild(incomplete);
            if (childHandleNodeFirstChild != null && tryWaitForChild(finishing, childHandleNodeFirstChild, obj)) {
                return JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            return finalizeFinishingState(finishing, obj);
        }
    }

    private final Throwable getExceptionOrNull(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    private final ChildHandleNode firstChild(Incomplete incomplete) {
        ChildHandleNode childHandleNode = incomplete instanceof ChildHandleNode ? (ChildHandleNode) incomplete : null;
        if (childHandleNode != null) {
            return childHandleNode;
        }
        NodeList list = incomplete.getList();
        if (list != null) {
            return nextChild(list);
        }
        return null;
    }

    private final boolean tryWaitForChild(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (JobKt__JobKt.invokeOnCompletion$default(childHandleNode.childJob, false, false, new ChildCompletion(this, finishing, childHandleNode, obj), 1, null) == NonDisposableHandle.INSTANCE) {
            childHandleNode = nextChild(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    public final void continueCompleting(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        ChildHandleNode childHandleNodeNextChild = nextChild(childHandleNode);
        if (childHandleNodeNextChild == null || !tryWaitForChild(finishing, childHandleNodeNextChild, obj)) {
            afterCompletion(finalizeFinishingState(finishing, obj));
        }
    }

    private final ChildHandleNode nextChild(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    @Override
    public final Sequence getChildren() {
        return SequencesKt.sequence(new JobSupport$children$1(this, null));
    }

    @Override
    public final ChildHandle attachChild(ChildJob childJob) {
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt__JobKt.invokeOnCompletion$default(this, true, false, new ChildHandleNode(childJob), 2, null);
        Intrinsics.checkNotNull(disposableHandleInvokeOnCompletion$default, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (ChildHandle) disposableHandleInvokeOnCompletion$default;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) throws Throwable {
        throw th;
    }

    public String toString() {
        return toDebugString() + '@' + DebugStringsKt.getHexAddress(this);
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    public String nameString$kotlinx_coroutines_core() {
        return DebugStringsKt.getClassSimpleName(this);
    }

    private final String stateString(Object obj) {
        if (obj instanceof Finishing) {
            Finishing finishing = (Finishing) obj;
            if (finishing.isCancelling()) {
                return "Cancelling";
            }
            return finishing.isCompleting() ? "Completing" : "Active";
        }
        if (obj instanceof Incomplete) {
            return ((Incomplete) obj).isActive() ? "Active" : "New";
        }
        return obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
    }

    private static final class Finishing implements Incomplete {
        private volatile Object _exceptionsHolder$volatile;
        private volatile int _isCompleting$volatile;
        private volatile Object _rootCause$volatile;
        private final NodeList list;
        private static final AtomicIntegerFieldUpdater _isCompleting$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting$volatile");
        private static final AtomicReferenceFieldUpdater _rootCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause$volatile");
        private static final AtomicReferenceFieldUpdater _exceptionsHolder$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder$volatile");

        @Override
        public NodeList getList() {
            return this.list;
        }

        public Finishing(NodeList nodeList, boolean z, Throwable th) {
            this.list = nodeList;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        public final boolean isCompleting() {
            return _isCompleting$volatile$FU.get(this) != 0;
        }

        public final void setCompleting(boolean z) {
            _isCompleting$volatile$FU.set(this, z ? 1 : 0);
        }

        public final Throwable getRootCause() {
            return (Throwable) _rootCause$volatile$FU.get(this);
        }

        public final void setRootCause(Throwable th) {
            _rootCause$volatile$FU.set(this, th);
        }

        private final Object getExceptionsHolder() {
            return _exceptionsHolder$volatile$FU.get(this);
        }

        private final void setExceptionsHolder(Object obj) {
            _exceptionsHolder$volatile$FU.set(this, obj);
        }

        public final boolean isSealed() {
            return getExceptionsHolder() == JobSupportKt.SEALED;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        @Override
        public boolean isActive() {
            return getRootCause() == null;
        }

        public final List sealLocked(Throwable th) {
            ArrayList arrayListAllocateList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayListAllocateList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                ArrayList arrayListAllocateList2 = allocateList();
                arrayListAllocateList2.add(exceptionsHolder);
                arrayListAllocateList = arrayListAllocateList2;
            } else {
                if (!(exceptionsHolder instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                arrayListAllocateList = (ArrayList) exceptionsHolder;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayListAllocateList.add(0, rootCause);
            }
            if (th != null && !Intrinsics.areEqual(th, rootCause)) {
                arrayListAllocateList.add(th);
            }
            setExceptionsHolder(JobSupportKt.SEALED);
            return arrayListAllocateList;
        }

        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(th);
                return;
            }
            if (exceptionsHolder instanceof Throwable) {
                if (th == exceptionsHolder) {
                    return;
                }
                ArrayList arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
                arrayListAllocateList.add(th);
                setExceptionsHolder(arrayListAllocateList);
                return;
            }
            if (exceptionsHolder instanceof ArrayList) {
                ((ArrayList) exceptionsHolder).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + exceptionsHolder).toString());
        }

        private final ArrayList allocateList() {
            return new ArrayList(4);
        }

        public String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + ']';
        }
    }

    private static final class ChildCompletion extends JobNode {
        private final ChildHandleNode child;
        private final JobSupport parent;
        private final Object proposedUpdate;
        private final Finishing state;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.parent = jobSupport;
            this.state = finishing;
            this.child = childHandleNode;
            this.proposedUpdate = obj;
        }

        @Override
        public void invoke(Throwable th) {
            this.parent.continueCompleting(this.state, this.child, this.proposedUpdate);
        }
    }

    private static final class AwaitContinuation extends CancellableContinuationImpl {
        private final JobSupport job;

        public AwaitContinuation(Continuation continuation, JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override
        public Throwable getContinuationCancellationCause(Job job) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Finishing) || (rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause()) == null) {
                return state$kotlinx_coroutines_core instanceof CompletedExceptionally ? ((CompletedExceptionally) state$kotlinx_coroutines_core).cause : job.getCancellationException();
            }
            return rootCause;
        }

        @Override
        protected String nameString() {
            return "AwaitContinuation";
        }
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
    }

    protected final Object awaitInternal(Continuation continuation) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                }
                return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(continuation);
    }

    private final Object awaitSuspend(Continuation continuation) {
        AwaitContinuation awaitContinuation = new AwaitContinuation(IntrinsicsKt.intercepted(continuation), this);
        awaitContinuation.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(awaitContinuation, JobKt__JobKt.invokeOnCompletion$default(this, false, false, new ResumeAwaitOnCompletion(awaitContinuation), 3, null));
        Object result = awaitContinuation.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    protected final SelectClause1 getOnAwaitInternal() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    public final void onAwaitInternalRegFunc(SelectInstance selectInstance, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                selectInstance.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        selectInstance.disposeOnCompletion(JobKt__JobKt.invokeOnCompletion$default(this, false, false, new SelectOnAwaitCompletionHandler(selectInstance), 3, null));
    }

    public final Object onAwaitInternalProcessResFunc(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj2).cause;
        }
        return obj2;
    }

    private final class SelectOnAwaitCompletionHandler extends JobNode {
        public SelectOnAwaitCompletionHandler(SelectInstance selectInstance) {
        }

        @Override
        public void invoke(Throwable th) {
            Object state$kotlinx_coroutines_core = JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            throw null;
        }
    }
}
