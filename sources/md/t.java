package md;

import hd.y1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public abstract class t extends d implements y1 {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");
    public final long f17670c;
    private volatile int cleanedAndPointers$volatile;

    public t(long j10, t tVar, int i9) {
        super(tVar);
        this.f17670c = j10;
        this.cleanedAndPointers$volatile = i9 << 16;
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

    public abstract void h(int i9, qc.h hVar);

    public final void i() {
        if (d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = d;
            i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 65536 + i9));
        return true;
    }
}
