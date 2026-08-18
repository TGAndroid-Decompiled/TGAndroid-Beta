package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.DebugStringsKt;

public class LockFreeLinkedListNode {
    private static final AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");
    private static final AtomicReferenceFieldUpdater _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");
    private static final AtomicReferenceFieldUpdater _removedRef$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public static final AtomicReferenceFieldUpdater get_next$volatile$FU() {
        return _next$volatile$FU;
    }

    private final Removed removed() {
        Removed removed = (Removed) _removedRef$volatile$FU.get(this);
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        _removedRef$volatile$FU.set(this, removed2);
        return removed2;
    }

    public static abstract class CondAddOp extends AtomicOp {
        public final LockFreeLinkedListNode newNode;
        public LockFreeLinkedListNode oldNext;

        public CondAddOp(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.newNode = lockFreeLinkedListNode;
        }

        @Override
        public void complete(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode2 != null && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(LockFreeLinkedListNode.get_next$volatile$FU(), lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.newNode;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.oldNext;
                Intrinsics.checkNotNull(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.finishAdd(lockFreeLinkedListNode4);
            }
        }
    }

    public boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    public final Object getNext() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public final LockFreeLinkedListNode getNextNode() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object next = getNext();
        Removed removed = next instanceof Removed ? (Removed) next : null;
        if (removed != null && (lockFreeLinkedListNode = removed.ref) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) next;
    }

    public final LockFreeLinkedListNode getPrevNode() {
        LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = correctPrev(null);
        return lockFreeLinkedListNodeCorrectPrev == null ? findPrevNonRemoved((LockFreeLinkedListNode) _prev$volatile$FU.get(this)) : lockFreeLinkedListNodeCorrectPrev;
    }

    private final LockFreeLinkedListNode findPrevNonRemoved(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) _prev$volatile$FU.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    public final boolean addOneIfEmpty(LockFreeLinkedListNode lockFreeLinkedListNode) {
        _prev$volatile$FU.set(lockFreeLinkedListNode, this);
        _next$volatile$FU.set(lockFreeLinkedListNode, this);
        while (getNext() == this) {
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.finishAdd(this);
                return true;
            }
        }
        return false;
    }

    public final int tryCondAddNext(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, CondAddOp condAddOp) {
        _prev$volatile$FU.set(lockFreeLinkedListNode, this);
        _next$volatile$FU.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        condAddOp.oldNext = lockFreeLinkedListNode2;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, lockFreeLinkedListNode2, condAddOp)) {
            return condAddOp.perform(this) == null ? 1 : 2;
        }
        return 0;
    }

    public boolean remove() {
        return removeOrNext() == null;
    }

    public final LockFreeLinkedListNode removeOrNext() {
        Object next;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            next = getNext();
            if (next instanceof Removed) {
                return ((Removed) next).ref;
            }
            if (next == this) {
                return (LockFreeLinkedListNode) next;
            }
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, next, lockFreeLinkedListNode.removed()));
        lockFreeLinkedListNode.correctPrev(null);
        return null;
    }

    public final void finishAdd(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (getNext() != lockFreeLinkedListNode) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_prev$volatile$FU, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (isRemoved()) {
            lockFreeLinkedListNode.correctPrev(null);
        }
    }

    private final LockFreeLinkedListNode correctPrev(OpDescriptor opDescriptor) {
        Object obj;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) _prev$volatile$FU.get(this);
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    obj = _next$volatile$FU.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode != lockFreeLinkedListNode2 && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_prev$volatile$FU, this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            break;
                        }
                        return lockFreeLinkedListNode2;
                    }
                    if (isRemoved()) {
                        return null;
                    }
                    if (obj == opDescriptor) {
                        return lockFreeLinkedListNode2;
                    }
                    if (obj instanceof OpDescriptor) {
                        ((OpDescriptor) obj).perform(lockFreeLinkedListNode2);
                        break;
                    }
                    if (!(obj instanceof Removed)) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) _prev$volatile$FU.get(lockFreeLinkedListNode2);
                    }
                }
                if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, lockFreeLinkedListNode3, lockFreeLinkedListNode2, ((Removed) obj).ref)) {
                    break;
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    public String toString() {
        return new PropertyReference0Impl(this) {
            @Override
            public Object get() {
                return DebugStringsKt.getClassSimpleName(this.receiver);
            }
        } + '@' + DebugStringsKt.getHexAddress(this);
    }
}
