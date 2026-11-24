package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;
public final class pyc {
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
        Unsafe unsafe = ex.a;
        f = unsafe.objectFieldOffset(pyc.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(pyc.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(pyc.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(pyc.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(pyc.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(pyc.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final int a() {
        return ex.a.getIntVolatile(this, g) - ex.a.getIntVolatile(this, e);
    }

    public final zfb b() {
        zfb zfbVar;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            pyc pycVar = this;
            if (unsafe.compareAndSwapInt(pycVar, j, intVolatile, intVolatile + 1) && (zfbVar = (zfb) pycVar.a.getAndSet(i, null)) != null) {
                if (zfbVar.b) {
                    c.decrementAndGet(pycVar);
                }
                return zfbVar;
            }
            this = pycVar;
        }
    }

    public final zfb c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        zfb zfbVar = (zfb) atomicReferenceArray.get(i2);
        if (zfbVar == null || zfbVar.b != z) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i2, zfbVar, null)) {
            if (atomicReferenceArray.get(i2) != zfbVar) {
                return null;
            }
        }
        if (z) {
            c.decrementAndGet(this);
        }
        return zfbVar;
    }
}
