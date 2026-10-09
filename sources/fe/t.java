package fe;

import ae.z1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public abstract class t extends d implements z1 {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");
    public final long f9915c;
    private volatile int cleanedAndPointers$volatile;

    public t(long j3, t tVar, int i10) {
        super(tVar);
        this.f9915c = j3;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override
    public final boolean d() {
        if (d.get(this) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (d.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i10, jd.h hVar);

    public final void i() {
        if (d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
