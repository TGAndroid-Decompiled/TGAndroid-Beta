package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;
public final class q0d {
    public static final AtomicIntegerFieldUpdater b;
    public static final AtomicIntegerFieldUpdater c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    static {
        Unsafe unsafe = fy.a;
        f = unsafe.objectFieldOffset(q0d.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(q0d.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(q0d.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(q0d.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(q0d.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(q0d.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final int a() {
        return fy.a.getIntVolatile(this, g) - fy.a.getIntVolatile(this, e);
    }

    public final aib b() {
        aib aibVar;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            q0d q0dVar = this;
            if (unsafe.compareAndSwapInt(q0dVar, j, intVolatile, intVolatile + 1) && (aibVar = (aib) q0dVar.a.getAndSet(i, null)) != null) {
                if (aibVar.b) {
                    c.decrementAndGet(q0dVar);
                }
                return aibVar;
            }
            this = q0dVar;
        }
    }

    public final aib c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        aib aibVar = (aib) atomicReferenceArray.get(i2);
        if (aibVar == null || aibVar.b != z) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i2, aibVar, null)) {
            if (atomicReferenceArray.get(i2) != aibVar) {
                return null;
            }
        }
        if (z) {
            c.decrementAndGet(this);
        }
        return aibVar;
    }
}
