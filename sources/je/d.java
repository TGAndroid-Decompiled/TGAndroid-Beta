package je;

import ae.g0;
import ae.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class d extends i implements a {
    public static final AtomicReferenceFieldUpdater f14134g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        da.a aVar;
        if (z10) {
            aVar = null;
        } else {
            aVar = e.f14135a;
        }
        this.owner$volatile = aVar;
    }

    public final boolean c() {
        if (Math.max(i.f14143f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(ld.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f14143f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                hd.i iVar = hd.i.f11092a;
                if (i11 <= 0) {
                    m l4 = g0.l(w7.h.b(cVar));
                    try {
                        a(new c(this, l4));
                        Object r10 = l4.r();
                        kd.a aVar = kd.a.f14784a;
                        if (r10 != aVar) {
                            r10 = iVar;
                        }
                        if (r10 == aVar) {
                            return r10;
                        }
                        return iVar;
                    } catch (Throwable th2) {
                        l4.A();
                        throw th2;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f14134g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14134g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            da.a aVar = e.f14135a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + g0.k(this) + "[isLocked=" + c() + ",owner=" + f14134g.get(this) + ']';
    }
}
