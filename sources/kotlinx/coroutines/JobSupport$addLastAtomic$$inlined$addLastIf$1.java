package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;

public final class JobSupport$addLastAtomic$$inlined$addLastIf$1 extends AtomicOp {
    public final Incomplete $expect$inlined;
    public final JobNode newNode;
    public NodeList oldNext;
    public final JobSupport this$0;

    public JobSupport$addLastAtomic$$inlined$addLastIf$1(JobNode jobNode, JobSupport jobSupport, Incomplete incomplete) {
        this.this$0 = jobSupport;
        this.$expect$inlined = incomplete;
        this.newNode = jobNode;
    }

    @Override
    public final void complete(Object obj, Object obj2) {
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
        boolean z = obj2 == null;
        JobNode jobNode = this.newNode;
        Incomplete incomplete = z ? jobNode : this.oldNext;
        if (incomplete != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$volatile$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, incomplete)) {
                if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != this) {
                    return;
                }
            }
            if (z) {
                NodeList nodeList = this.oldNext;
                Intrinsics.checkNotNull(nodeList);
                jobNode.finishAdd(nodeList);
            }
        }
    }

    @Override
    public final Symbol prepare(Object obj) {
        if (this.this$0.getState$kotlinx_coroutines_core() == this.$expect$inlined) {
            return null;
        }
        return AtomicKt.CONDITION_FALSE;
    }
}
