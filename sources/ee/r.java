package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.q1;
public abstract class r extends b implements q1 {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    public final long f10794c;
    private volatile int cleanedAndPointers$volatile;

    public r(long j3, r rVar, int i7) {
        super(rVar);
        this.f10794c = j3;
        this.cleanedAndPointers$volatile = i7 << 16;
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

    public abstract void h(int i7, id.h hVar);

    public final void i() {
        if (d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
