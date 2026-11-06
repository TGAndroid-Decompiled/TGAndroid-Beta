package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f13863b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");
    public static final AtomicIntegerFieldUpdater f13864c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");
    public static final AtomicIntegerFieldUpdater f13865e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray f13866a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f13864c.get(this) == 0) {
                return null;
            }
            int i10 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (iVar = (i) this.f13866a.getAndSet(i10, null)) != null) {
                if (iVar.f13855b) {
                    f13865e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i7, boolean z9) {
        int i10 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f13866a;
        i iVar = (i) atomicReferenceArray.get(i10);
        if (iVar == null || iVar.f13855b != z9) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i10, iVar, null)) {
            if (atomicReferenceArray.get(i10) != iVar) {
                return null;
            }
        }
        if (z9) {
            f13865e.decrementAndGet(this);
        }
        return iVar;
    }
}
