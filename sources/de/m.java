package de;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f8835b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final AtomicIntegerFieldUpdater f8836c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final AtomicIntegerFieldUpdater f8837e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray f8838a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f8836c.get(this) == 0) {
                return null;
            }
            int i10 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (iVar = (i) this.f8838a.getAndSet(i10, null)) != null) {
                if (iVar.f8827b) {
                    f8837e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i3, boolean z10) {
        int i10 = i3 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f8838a;
        i iVar = (i) atomicReferenceArray.get(i10);
        if (iVar == null || iVar.f8827b != z10) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i10, iVar, null)) {
            if (atomicReferenceArray.get(i10) != iVar) {
                return null;
            }
        }
        if (z10) {
            f8837e.decrementAndGet(this);
        }
        return iVar;
    }
}
