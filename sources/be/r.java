package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wd.q1;
public abstract class r extends b implements q1 {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    public final long f3282c;
    private volatile int cleanedAndPointers$volatile;

    public r(long j10, r rVar, int i3) {
        super(rVar);
        this.f3282c = j10;
        this.cleanedAndPointers$volatile = i3 << 16;
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

    public abstract void h(int i3, fd.h hVar);

    public final void i() {
        if (d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = d;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
