package od;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f19231b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final AtomicIntegerFieldUpdater f19232c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final AtomicIntegerFieldUpdater f19233e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray f19234a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 - f19232c.get(this) == 0) {
                return null;
            }
            int i10 = i9 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i9, i9 + 1) && (iVar = (i) this.f19234a.getAndSet(i10, null)) != null) {
                if (iVar.f19222b.f2981a == 1) {
                    f19233e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i9, boolean z10) {
        int i10 = i9 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f19234a;
        i iVar = (i) atomicReferenceArray.get(i10);
        if (iVar != null) {
            boolean z11 = true;
            if (iVar.f19222b.f2981a != 1) {
                z11 = false;
            }
            if (z11 == z10) {
                while (!atomicReferenceArray.compareAndSet(i10, iVar, null)) {
                    if (atomicReferenceArray.get(i10) != iVar) {
                    }
                }
                if (z10) {
                    f19233e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
