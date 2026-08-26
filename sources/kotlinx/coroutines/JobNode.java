package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Removed;

public abstract class JobNode extends LockFreeLinkedListNode implements InternalCompletionHandler, DisposableHandle, Incomplete {
    public JobSupport job;

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        JobSupport job = getJob();
        while (true) {
            Object state$kotlinx_coroutines_core = job.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof JobNode) {
                if (state$kotlinx_coroutines_core != this) {
                    return;
                }
                Empty empty = JobKt.EMPTY_ACTIVE;
                do {
                    atomicReferenceFieldUpdater2 = JobSupport._state$volatile$FU;
                    if (atomicReferenceFieldUpdater2.compareAndSet(job, state$kotlinx_coroutines_core, empty)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(job) == state$kotlinx_coroutines_core);
            } else {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                while (true) {
                    Object next = getNext();
                    if (next instanceof Removed) {
                        LockFreeLinkedListNode lockFreeLinkedListNode = ((Removed) next).ref;
                        return;
                    }
                    if (next == this) {
                        return;
                    }
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) next;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LockFreeLinkedListNode._removedRef$volatile$FU;
                    Removed removed = (Removed) atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode2);
                    if (removed == null) {
                        removed = new Removed(lockFreeLinkedListNode2);
                        atomicReferenceFieldUpdater3.set(lockFreeLinkedListNode2, removed);
                    }
                    do {
                        atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$volatile$FU;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, next, removed)) {
                            lockFreeLinkedListNode2.correctPrev();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == next);
                }
            }
        }
    }

    public final JobSupport getJob() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        throw null;
    }

    @Override
    public final NodeList getList() {
        return null;
    }

    public Job getParent() {
        return getJob();
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + JobKt.getHexAddress(this) + "[job@" + JobKt.getHexAddress(getJob()) + ']';
    }
}
