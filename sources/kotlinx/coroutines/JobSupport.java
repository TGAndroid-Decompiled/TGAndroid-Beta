package kotlinx.coroutines;

import androidx.car.app.HostException;
import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.google.common.base.Joiner;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;

public class JobSupport implements Job, ChildJob, ParentJob {
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public static final AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");

    public final class AwaitContinuation extends CancellableContinuationImpl {
        public final JobSupport job;

        public AwaitContinuation(Continuation continuation, JobSupport jobSupport) {
            super(1, continuation);
            this.job = jobSupport;
        }

        @Override
        public final Throwable getContinuationCancellationCause(JobSupport jobSupport) {
            Throwable rootCause;
            Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Finishing) || (rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause()) == null) {
                return state$kotlinx_coroutines_core instanceof CompletedExceptionally ? ((CompletedExceptionally) state$kotlinx_coroutines_core).cause : jobSupport.getCancellationException();
            }
            return rootCause;
        }

        @Override
        public final String nameString() {
            return "AwaitContinuation";
        }
    }

    public final class ChildCompletion extends JobNode {
        public final ChildHandleNode child;
        public final JobSupport parent;
        public final Object proposedUpdate;
        public final Finishing state;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.parent = jobSupport;
            this.state = finishing;
            this.child = childHandleNode;
            this.proposedUpdate = obj;
        }

        @Override
        public final void invoke(Throwable th) {
            ChildHandleNode childHandleNode = this.child;
            JobSupport jobSupport = this.parent;
            jobSupport.getClass();
            ChildHandleNode childHandleNodeNextChild = JobSupport.nextChild(childHandleNode);
            Finishing finishing = this.state;
            Object obj = this.proposedUpdate;
            if (childHandleNodeNextChild != null) {
                while (JobKt.invokeOnCompletion$default(childHandleNodeNextChild.childJob, false, new ChildCompletion(jobSupport, finishing, childHandleNodeNextChild, obj), 1) == NonDisposableHandle.INSTANCE) {
                    childHandleNodeNextChild = JobSupport.nextChild(childHandleNodeNextChild);
                    if (childHandleNodeNextChild == null) {
                    }
                }
                return;
            }
            jobSupport.afterCompletion(jobSupport.finalizeFinishingState(finishing, obj));
        }
    }

    public final class Finishing implements Incomplete {
        private volatile Object _exceptionsHolder$volatile;
        private volatile int _isCompleting$volatile = 0;
        private volatile Object _rootCause$volatile;
        public final NodeList list;
        public static final AtomicIntegerFieldUpdater _isCompleting$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting$volatile");
        public static final AtomicReferenceFieldUpdater _rootCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause$volatile");
        public static final AtomicReferenceFieldUpdater _exceptionsHolder$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder$volatile");

        public Finishing(NodeList nodeList, Throwable th) {
            this.list = nodeList;
            this._rootCause$volatile = th;
        }

        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                _rootCause$volatile$FU.set(this, th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _exceptionsHolder$volatile$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Override
        public final NodeList getList() {
            return this.list;
        }

        public final Throwable getRootCause() {
            return (Throwable) _rootCause$volatile$FU.get(this);
        }

        @Override
        public final boolean isActive() {
            return getRootCause() == null;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        public final boolean isCompleting() {
            return _isCompleting$volatile$FU.get(this) != 0;
        }

        public final ArrayList sealLocked(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _exceptionsHolder$volatile$FU;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayList.add(0, rootCause);
            }
            if (th != null && !th.equals(rootCause)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, JobKt.SEALED);
            return arrayList;
        }

        public final String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + _exceptionsHolder$volatile$FU.get(this) + ", list=" + this.list + ']';
        }
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? JobKt.EMPTY_ACTIVE : JobKt.EMPTY_NEW;
    }

    public static ChildHandleNode nextChild(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = lockFreeLinkedListNode.correctPrev();
            if (lockFreeLinkedListNodeCorrectPrev == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._prev$volatile$FU;
                Object obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNode.isRemoved()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                }
            } else {
                lockFreeLinkedListNode = lockFreeLinkedListNodeCorrectPrev;
            }
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

    public static String stateString(Object obj) {
        if (!(obj instanceof Finishing)) {
            if (obj instanceof Incomplete) {
                return ((Incomplete) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        if (finishing.isCancelling()) {
            return "Cancelling";
        }
        return finishing.isCompleting() ? "Completing" : "Active";
    }

    public final boolean addLastAtomic(Incomplete incomplete, NodeList nodeList, JobNode jobNode) {
        char c;
        JobSupport$addLastAtomic$$inlined$addLastIf$1 jobSupport$addLastAtomic$$inlined$addLastIf$1 = new JobSupport$addLastAtomic$$inlined$addLastIf$1(jobNode, this, incomplete);
        do {
            LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = nodeList.correctPrev();
            if (lockFreeLinkedListNodeCorrectPrev == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._prev$volatile$FU;
                Object obj = atomicReferenceFieldUpdater.get(nodeList);
                while (true) {
                    lockFreeLinkedListNodeCorrectPrev = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNodeCorrectPrev.isRemoved()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeCorrectPrev);
                }
            }
            LockFreeLinkedListNode._prev$volatile$FU.set(jobNode, lockFreeLinkedListNodeCorrectPrev);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$volatile$FU;
            atomicReferenceFieldUpdater2.set(jobNode, nodeList);
            jobSupport$addLastAtomic$$inlined$addLastIf$1.oldNext = nodeList;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNodeCorrectPrev, nodeList, jobSupport$addLastAtomic$$inlined$addLastIf$1)) {
                    if (jobSupport$addLastAtomic$$inlined$addLastIf$1.perform(lockFreeLinkedListNodeCorrectPrev) != null) {
                        c = 2;
                        break;
                    }
                    c = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNodeCorrectPrev) != nodeList) {
                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    public void afterCompletion(Object obj) {
    }

    public void afterResume(Object obj) {
        afterCompletion(obj);
    }

    @Override
    public final ChildHandle attachChild(ChildJob childJob) {
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt.invokeOnCompletion$default(this, true, new ChildHandleNode(childJob), 2);
        Intrinsics.checkNotNull(disposableHandleInvokeOnCompletion$default, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (ChildHandle) disposableHandleInvokeOnCompletion$default;
    }

    public final Object awaitInternal(Continuation continuation) throws Throwable {
        Object state$kotlinx_coroutines_core;
        int i = 0;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                }
                return JobKt.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        AwaitContinuation awaitContinuation = new AwaitContinuation(zzjf.intercepted(continuation), this);
        awaitContinuation.initCancellability();
        awaitContinuation.invokeOnCancellationImpl(new DisposeOnCancel(JobKt.invokeOnCompletion$default(this, false, new InvokeOnCompletion(awaitContinuation, 2), 3), i));
        Object result = awaitContinuation.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) {
        Throwable thCreateCauseException;
        Object state$kotlinx_coroutines_core;
        Finishing finishing;
        boolean z;
        Throwable rootCause;
        Joiner joiner;
        Incomplete incomplete;
        NodeList orPromoteCancellingList;
        Finishing finishing2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objTryMakeCompleting;
        Object objTryMakeCompleting2 = JobKt.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core()) {
            do {
                Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core2 instanceof Incomplete) || ((state$kotlinx_coroutines_core2 instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core2).isCompleting())) {
                    objTryMakeCompleting2 = JobKt.COMPLETING_ALREADY;
                    break;
                }
                objTryMakeCompleting2 = tryMakeCompleting(state$kotlinx_coroutines_core2, new CompletedExceptionally(createCauseException(obj), false));
            } while (objTryMakeCompleting2 == JobKt.COMPLETING_RETRY);
            if (objTryMakeCompleting2 != JobKt.COMPLETING_WAITING_CHILDREN) {
                if (objTryMakeCompleting2 == JobKt.COMPLETING_ALREADY) {
                    thCreateCauseException = null;
                    loop1: while (true) {
                        state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
                        if (state$kotlinx_coroutines_core instanceof Finishing) {
                            synchronized (state$kotlinx_coroutines_core) {
                                try {
                                    finishing = (Finishing) state$kotlinx_coroutines_core;
                                    finishing.getClass();
                                    if (Finishing._exceptionsHolder$volatile$FU.get(finishing) == JobKt.SEALED) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        joiner = JobKt.TOO_LATE_TO_CANCEL;
                                    } else {
                                        boolean zIsCancelling = ((Finishing) state$kotlinx_coroutines_core).isCancelling();
                                        if (thCreateCauseException == null) {
                                            thCreateCauseException = createCauseException(obj);
                                        }
                                        ((Finishing) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                                        rootCause = zIsCancelling ? null : ((Finishing) state$kotlinx_coroutines_core).getRootCause();
                                        if (rootCause != null) {
                                            notifyCancelling(((Finishing) state$kotlinx_coroutines_core).list, rootCause);
                                        }
                                        joiner = JobKt.COMPLETING_ALREADY;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (state$kotlinx_coroutines_core instanceof Incomplete) {
                            if (thCreateCauseException == null) {
                                thCreateCauseException = createCauseException(obj);
                            }
                            incomplete = (Incomplete) state$kotlinx_coroutines_core;
                            if (incomplete.isActive()) {
                                orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
                                if (orPromoteCancellingList == null) {
                                    continue;
                                } else {
                                    finishing2 = new Finishing(orPromoteCancellingList, thCreateCauseException);
                                    while (true) {
                                        atomicReferenceFieldUpdater = _state$volatile$FU;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, finishing2)) {
                                            notifyCancelling(orPromoteCancellingList, thCreateCauseException);
                                            joiner = JobKt.COMPLETING_ALREADY;
                                        } else if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                                        }
                                    }
                                }
                            } else {
                                objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(thCreateCauseException, false));
                                if (objTryMakeCompleting != JobKt.COMPLETING_ALREADY) {
                                    throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                                }
                                if (objTryMakeCompleting != JobKt.COMPLETING_RETRY) {
                                    objTryMakeCompleting2 = objTryMakeCompleting;
                                    break;
                                }
                            }
                        } else {
                            joiner = JobKt.TOO_LATE_TO_CANCEL;
                        }
                        objTryMakeCompleting2 = joiner;
                        break;
                    }
                }
                if (objTryMakeCompleting2 != JobKt.COMPLETING_ALREADY && objTryMakeCompleting2 != JobKt.COMPLETING_WAITING_CHILDREN) {
                    if (objTryMakeCompleting2 == JobKt.TOO_LATE_TO_CANCEL) {
                        return false;
                    }
                    afterCompletion(objTryMakeCompleting2);
                    return true;
                }
            }
        } else {
            if (objTryMakeCompleting2 == JobKt.COMPLETING_ALREADY) {
                thCreateCauseException = null;
                loop1: while (true) {
                    state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
                    if (state$kotlinx_coroutines_core instanceof Finishing) {
                        synchronized (state$kotlinx_coroutines_core) {
                            finishing = (Finishing) state$kotlinx_coroutines_core;
                            finishing.getClass();
                            if (Finishing._exceptionsHolder$volatile$FU.get(finishing) == JobKt.SEALED) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                joiner = JobKt.TOO_LATE_TO_CANCEL;
                            } else {
                                boolean zIsCancelling2 = ((Finishing) state$kotlinx_coroutines_core).isCancelling();
                                if (thCreateCauseException == null) {
                                    thCreateCauseException = createCauseException(obj);
                                }
                                ((Finishing) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                                if (zIsCancelling2) {
                                }
                                if (rootCause != null) {
                                    notifyCancelling(((Finishing) state$kotlinx_coroutines_core).list, rootCause);
                                }
                                joiner = JobKt.COMPLETING_ALREADY;
                            }
                        }
                    } else if (state$kotlinx_coroutines_core instanceof Incomplete) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(obj);
                        }
                        incomplete = (Incomplete) state$kotlinx_coroutines_core;
                        if (incomplete.isActive()) {
                            orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
                            if (orPromoteCancellingList == null) {
                                continue;
                            } else {
                                finishing2 = new Finishing(orPromoteCancellingList, thCreateCauseException);
                                while (true) {
                                    atomicReferenceFieldUpdater = _state$volatile$FU;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, finishing2)) {
                                        notifyCancelling(orPromoteCancellingList, thCreateCauseException);
                                        joiner = JobKt.COMPLETING_ALREADY;
                                    } else if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                                    }
                                }
                            }
                        } else {
                            objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new CompletedExceptionally(thCreateCauseException, false));
                            if (objTryMakeCompleting != JobKt.COMPLETING_ALREADY) {
                                throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                            }
                            if (objTryMakeCompleting != JobKt.COMPLETING_RETRY) {
                                objTryMakeCompleting2 = objTryMakeCompleting;
                                break;
                            }
                        }
                    } else {
                        joiner = JobKt.TOO_LATE_TO_CANCEL;
                    }
                    objTryMakeCompleting2 = joiner;
                    break;
                }
            }
            if (objTryMakeCompleting2 != JobKt.COMPLETING_ALREADY) {
                if (objTryMakeCompleting2 == JobKt.TOO_LATE_TO_CANCEL) {
                    return false;
                }
                afterCompletion(objTryMakeCompleting2);
                return true;
            }
        }
        return true;
    }

    public final boolean cancelParent(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ChildHandle childHandle = (ChildHandle) _parentHandle$volatile$FU.get(this);
        if (childHandle == null || childHandle == NonDisposableHandle.INSTANCE) {
            return z;
        }
        return childHandle.childCancelled(th) || z;
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final void completeStateFinalization(Incomplete incomplete, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _parentHandle$volatile$FU;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        if (childHandle != null) {
            childHandle.dispose();
            atomicReferenceFieldUpdater.set(this, NonDisposableHandle.INSTANCE);
        }
        HostException hostException = null;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).invoke(th);
                return;
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new HostException("Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        NodeList list = incomplete.getList();
        if (list != null) {
            Object next = list.getNext();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !nextNode.equals(list); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof JobNode) {
                    JobNode jobNode = (JobNode) nextNode;
                    try {
                        jobNode.invoke(th);
                    } catch (Throwable th3) {
                        if (hostException != null) {
                            ExceptionsKt.addSuppressed(hostException, th3);
                        } else {
                            hostException = new HostException("Exception in completion handler " + jobNode + " for " + this, th3);
                        }
                    }
                }
            }
            if (hostException != null) {
                handleOnCompletionException$kotlinx_coroutines_core(hostException);
            }
        }
    }

    public final Throwable createCauseException(Object obj) {
        Throwable rootCause;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        JobSupport jobSupport = (JobSupport) ((ParentJob) obj);
        Object state$kotlinx_coroutines_core = jobSupport.getState$kotlinx_coroutines_core();
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
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(stateString(state$kotlinx_coroutines_core)), rootCause, jobSupport) : cancellationException;
    }

    public final Object finalizeFinishingState(Finishing finishing, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable finalRootCause;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (finishing) {
            finishing.isCancelling();
            ArrayList arrayListSealLocked = finishing.sealLocked(th);
            finalRootCause = getFinalRootCause(finishing, arrayListSealLocked);
            if (finalRootCause != null && arrayListSealLocked.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListSealLocked.size()));
                int size = arrayListSealLocked.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListSealLocked.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != finalRootCause && th2 != finalRootCause && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        ExceptionsKt.addSuppressed(finalRootCause, th2);
                    }
                }
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            obj = new CompletedExceptionally(finalRootCause, false);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            CompletedExceptionally._handled$volatile$FU.compareAndSet((CompletedExceptionally) obj, 0, 1);
        }
        onCompletionInternal(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        Object incompleteStateBox = obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, finishing, incompleteStateBox) && atomicReferenceFieldUpdater.get(this) == finishing) {
        }
        completeStateFinalization(finishing, obj);
        return obj;
    }

    @Override
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override
    public final CancellationException getCancellationException() {
        CancellationException jobCancellationException;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof Finishing)) {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
            jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return jobCancellationException == null ? new JobCancellationException(cancellationExceptionMessage(), th, this) : jobCancellationException;
        }
        Throwable rootCause = ((Finishing) state$kotlinx_coroutines_core).getRootCause();
        if (rootCause == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        jobCancellationException = rootCause instanceof CancellationException ? (CancellationException) rootCause : null;
        if (jobCancellationException == null) {
            if (strConcat == null) {
                strConcat = cancellationExceptionMessage();
            }
            jobCancellationException = new JobCancellationException(strConcat, rootCause, this);
        }
        return jobCancellationException;
    }

    @Override
    public final Sequence getChildren() {
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(new JobSupport$children$1(null, this), 1);
    }

    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return JobKt.unboxState(state$kotlinx_coroutines_core);
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public final Throwable getFinalRootCause(Finishing finishing, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (finishing.isCancelling()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override
    public final CoroutineContext.Key getKey() {
        return Job.Key.$$INSTANCE;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return this instanceof CompletableDeferredImpl;
    }

    public final NodeList getOrPromoteCancellingList(Incomplete incomplete) {
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

    @Override
    public final Job getParent() {
        ChildHandle childHandle = (ChildHandle) _parentHandle$volatile$FU.get(this);
        if (childHandle != null) {
            return childHandle.getParent();
        }
        return null;
    }

    public final Object getState$kotlinx_coroutines_core() {
        while (true) {
            Object obj = _state$volatile$FU.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public boolean handleJobException(Throwable th) {
        return false;
    }

    public final void initParentJob(Job job) {
        NonDisposableHandle nonDisposableHandle = NonDisposableHandle.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _parentHandle$volatile$FU;
        if (job == null) {
            atomicReferenceFieldUpdater.set(this, nonDisposableHandle);
            return;
        }
        job.start();
        ChildHandle childHandleAttachChild = job.attachChild(this);
        atomicReferenceFieldUpdater.set(this, childHandleAttachChild);
        if (getState$kotlinx_coroutines_core() instanceof Incomplete) {
            return;
        }
        childHandleAttachChild.dispose();
        atomicReferenceFieldUpdater.set(this, nonDisposableHandle);
    }

    @Override
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(false, true, new InternalCompletionHandler.UserSupplied(function1));
    }

    public final DisposableHandle invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z, boolean z2, InternalCompletionHandler internalCompletionHandler) {
        JobNode invokeOnCompletion;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable rootCause;
        if (z) {
            invokeOnCompletion = internalCompletionHandler instanceof JobCancellingNode ? (JobCancellingNode) internalCompletionHandler : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCancelling(internalCompletionHandler);
            }
        } else {
            invokeOnCompletion = internalCompletionHandler instanceof JobNode ? (JobNode) internalCompletionHandler : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCompletion(internalCompletionHandler, 0);
            }
        }
        invokeOnCompletion.job = this;
        loop0: while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof Empty) {
                Empty empty = (Empty) state$kotlinx_coroutines_core;
                if (empty.isActive) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, state$kotlinx_coroutines_core, invokeOnCompletion)) {
                        if (atomicReferenceFieldUpdater2.get(this) != state$kotlinx_coroutines_core) {
                        }
                    }
                    break loop0;
                }
                NodeList nodeList = new NodeList();
                Incomplete inactiveNodeList = empty.isActive ? nodeList : new InactiveNodeList(nodeList);
                do {
                    atomicReferenceFieldUpdater = _state$volatile$FU;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, empty, inactiveNodeList)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == empty);
            } else {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                    if (z2) {
                        CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core : null;
                        internalCompletionHandler.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    }
                    return NonDisposableHandle.INSTANCE;
                }
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
                                    if (addLastAtomic((Incomplete) state$kotlinx_coroutines_core, list, invokeOnCompletion)) {
                                        if (rootCause == null) {
                                            return invokeOnCompletion;
                                        }
                                        disposableHandle = invokeOnCompletion;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (rootCause != null) {
                            if (z2) {
                                internalCompletionHandler.invoke(rootCause);
                            }
                            return disposableHandle;
                        }
                        if (addLastAtomic((Incomplete) state$kotlinx_coroutines_core, list, invokeOnCompletion)) {
                            break;
                            break;
                        }
                    } else {
                        rootCause = null;
                        if (rootCause != null) {
                            if (z2) {
                                internalCompletionHandler.invoke(rootCause);
                            }
                            return disposableHandle;
                        }
                        if (addLastAtomic((Incomplete) state$kotlinx_coroutines_core, list, invokeOnCompletion)) {
                            break;
                        }
                    }
                }
            }
        }
        return invokeOnCompletion;
    }

    @Override
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).isActive();
    }

    @Override
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            return true;
        }
        return (state$kotlinx_coroutines_core instanceof Finishing) && ((Finishing) state$kotlinx_coroutines_core).isCancelling();
    }

    public boolean isScopedCoroutine() {
        return this instanceof BlockingCoroutine;
    }

    @Override
    public final Object join(Continuation continuation) {
        boolean z;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                z = false;
                break;
            }
            if (startInternal(state$kotlinx_coroutines_core) >= 0) {
                z = true;
                break;
            }
        }
        Unit unit = Unit.INSTANCE;
        if (!z) {
            JobKt.ensureActive(continuation.getContext());
            return unit;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, zzjf.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellationImpl(new DisposeOnCancel(JobKt.invokeOnCompletion$default(this, false, new InvokeOnCompletion(cancellableContinuationImpl, 3), 3), 0));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (result != coroutineSingletons) {
            result = unit;
        }
        return result == coroutineSingletons ? result : unit;
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobKt.COMPLETING_ALREADY) {
                return false;
            }
            if (objTryMakeCompleting == JobKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (objTryMakeCompleting == JobKt.COMPLETING_RETRY);
        afterCompletion(objTryMakeCompleting);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), obj);
            if (objTryMakeCompleting == JobKt.COMPLETING_ALREADY) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
                throw new IllegalStateException(str, completedExceptionally != null ? completedExceptionally.cause : null);
            }
        } while (objTryMakeCompleting == JobKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    @Override
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public String nameString$kotlinx_coroutines_core() {
        return getClass().getSimpleName();
    }

    public final void notifyCancelling(NodeList nodeList, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object next = nodeList.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        HostException hostException = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !nextNode.equals(nodeList); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    if (hostException != null) {
                        ExceptionsKt.addSuppressed(hostException, th2);
                    } else {
                        hostException = new HostException("Exception in completion handler " + jobNode + " for " + this, th2);
                    }
                }
            }
        }
        if (hostException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(hostException);
        }
        cancelParent(th);
    }

    public void onCompletionInternal(Object obj) {
    }

    public void onStart() {
    }

    @Override
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final void promoteSingleToNodeList(JobNode jobNode) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        NodeList nodeList = new NodeList();
        jobNode.getClass();
        LockFreeLinkedListNode._prev$volatile$FU.set(nodeList, jobNode);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$volatile$FU;
        atomicReferenceFieldUpdater2.set(nodeList, jobNode);
        loop0: while (jobNode.getNext() == jobNode) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(jobNode, jobNode, nodeList)) {
                    nodeList.finishAdd(jobNode);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(jobNode) == jobNode);
        }
        LockFreeLinkedListNode nextNode = jobNode.getNextNode();
        do {
            atomicReferenceFieldUpdater = _state$volatile$FU;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jobNode, nextNode)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == jobNode);
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

    public final int startInternal(Object obj) {
        boolean z = obj instanceof Empty;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        if (z) {
            if (((Empty) obj).isActive) {
                return 0;
            }
            Empty empty = JobKt.EMPTY_ACTIVE;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        NodeList nodeList = ((InactiveNodeList) obj).list;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nodeList)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}');
        sb.append('@');
        sb.append(JobKt.getHexAddress(this));
        return sb.toString();
    }

    public final Object tryMakeCompleting(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof Incomplete)) {
            return JobKt.COMPLETING_ALREADY;
        }
        if (((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) {
            Incomplete incomplete = (Incomplete) obj;
            Object incompleteStateBox = obj2 instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = _state$volatile$FU;
                if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, incompleteStateBox)) {
                    onCompletionInternal(obj2);
                    completeStateFinalization(incomplete, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == incomplete);
            return JobKt.COMPLETING_RETRY;
        }
        Incomplete incomplete2 = (Incomplete) obj;
        NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete2);
        if (orPromoteCancellingList == null) {
            return JobKt.COMPLETING_RETRY;
        }
        ChildHandleNode childHandleNodeNextChild = null;
        Finishing finishing = incomplete2 instanceof Finishing ? (Finishing) incomplete2 : null;
        if (finishing == null) {
            finishing = new Finishing(orPromoteCancellingList, null);
        }
        synchronized (finishing) {
            try {
                if (finishing.isCompleting()) {
                    return JobKt.COMPLETING_ALREADY;
                }
                Finishing._isCompleting$volatile$FU.set(finishing, 1);
                if (finishing != incomplete2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, incomplete2, finishing)) {
                        if (atomicReferenceFieldUpdater2.get(this) != incomplete2) {
                            return JobKt.COMPLETING_RETRY;
                        }
                    }
                }
                boolean zIsCancelling = finishing.isCancelling();
                CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
                if (completedExceptionally != null) {
                    finishing.addExceptionLocked(completedExceptionally.cause);
                }
                Throwable rootCause = finishing.getRootCause();
                if (zIsCancelling) {
                    rootCause = null;
                }
                if (rootCause != null) {
                    notifyCancelling(orPromoteCancellingList, rootCause);
                }
                ChildHandleNode childHandleNode = incomplete2 instanceof ChildHandleNode ? (ChildHandleNode) incomplete2 : null;
                if (childHandleNode == null) {
                    NodeList list = incomplete2.getList();
                    if (list != null) {
                        childHandleNodeNextChild = nextChild(list);
                    }
                } else {
                    childHandleNodeNextChild = childHandleNode;
                }
                if (childHandleNodeNextChild != null) {
                    while (JobKt.invokeOnCompletion$default(childHandleNodeNextChild.childJob, false, new ChildCompletion(this, finishing, childHandleNodeNextChild, obj2), 1) == NonDisposableHandle.INSTANCE) {
                        childHandleNodeNextChild = nextChild(childHandleNodeNextChild);
                        if (childHandleNodeNextChild == null) {
                        }
                    }
                    return JobKt.COMPLETING_WAITING_CHILDREN;
                }
                return finalizeFinishingState(finishing, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z, z2, new InternalCompletionHandler.UserSupplied(function1));
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(HostException hostException) {
        throw hostException;
    }
}
