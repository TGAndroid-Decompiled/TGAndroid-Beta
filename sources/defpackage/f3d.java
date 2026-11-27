package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;
public final class f3d {
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
        Unsafe unsafe = fx.a;
        f = unsafe.objectFieldOffset(f3d.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(f3d.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(f3d.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(f3d.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(f3d.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(f3d.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final int a() {
        return fx.a.getIntVolatile(this, g) - fx.a.getIntVolatile(this, e);
    }

    public final vjb b() {
        vjb vjbVar;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            f3d f3dVar = this;
            if (unsafe.compareAndSwapInt(f3dVar, j, intVolatile, intVolatile + 1) && (vjbVar = (vjb) f3dVar.a.getAndSet(i, null)) != null) {
                if (vjbVar.b) {
                    c.decrementAndGet(f3dVar);
                }
                return vjbVar;
            }
            this = f3dVar;
        }
    }

    public final vjb c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        vjb vjbVar = (vjb) atomicReferenceArray.get(i2);
        if (vjbVar == null || vjbVar.b != z) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i2, vjbVar, null)) {
            if (atomicReferenceArray.get(i2) != vjbVar) {
                return null;
            }
        }
        if (z) {
            c.decrementAndGet(this);
        }
        return vjbVar;
    }
}
