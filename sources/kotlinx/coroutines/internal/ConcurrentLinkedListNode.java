package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

public abstract class ConcurrentLinkedListNode {
    public static final AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public ConcurrentLinkedListNode(Segment segment) {
        this._prev$volatile = segment;
    }

    public final void cleanPrev() {
        _prev$volatile$FU.set(this, null);
    }

    public final ConcurrentLinkedListNode getNext() {
        Object obj = _next$volatile$FU.get(this);
        if (obj == AtomicKt.CLOSED) {
            return null;
        }
        return (ConcurrentLinkedListNode) obj;
    }

    public abstract boolean isRemoved();

    public final void remove() {
        ConcurrentLinkedListNode next;
        if (getNext() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) atomicReferenceFieldUpdater.get(this);
            while (concurrentLinkedListNode != null && concurrentLinkedListNode.isRemoved()) {
                concurrentLinkedListNode = (ConcurrentLinkedListNode) atomicReferenceFieldUpdater.get(concurrentLinkedListNode);
            }
            ConcurrentLinkedListNode next2 = getNext();
            Intrinsics.checkNotNull(next2);
            while (next2.isRemoved() && (next = next2.getNext()) != null) {
                next2 = next;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(next2);
                ConcurrentLinkedListNode concurrentLinkedListNode2 = ((ConcurrentLinkedListNode) obj) == null ? null : concurrentLinkedListNode;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(next2, obj, concurrentLinkedListNode2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(next2) != obj) {
                    }
                }
            }
            if (concurrentLinkedListNode != null) {
                _next$volatile$FU.set(concurrentLinkedListNode, next2);
            }
            if (!next2.isRemoved() || next2.getNext() == null) {
                if (concurrentLinkedListNode == null || !concurrentLinkedListNode.isRemoved()) {
                    return;
                }
            }
        }
    }
}
