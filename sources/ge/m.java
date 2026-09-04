package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f10622b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final AtomicIntegerFieldUpdater f10623c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final AtomicIntegerFieldUpdater f10624e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray f10625a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f10623c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (iVar = (i) this.f10625a.getAndSet(i11, null)) != null) {
                if (iVar.f10613b.f5184a == 1) {
                    f10624e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i10, boolean z10) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f10625a;
        i iVar = (i) atomicReferenceArray.get(i11);
        if (iVar != null) {
            boolean z11 = true;
            if (iVar.f10613b.f5184a != 1) {
                z11 = false;
            }
            if (z11 == z10) {
                while (!atomicReferenceArray.compareAndSet(i11, iVar, null)) {
                    if (atomicReferenceArray.get(i11) != iVar) {
                    }
                }
                if (z10) {
                    f10624e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
