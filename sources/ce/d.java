package ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.e0;
import td.m;
import v7.w6;
public final class d extends i implements a {
    public static final AtomicReferenceFieldUpdater f4128g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        ea.a aVar;
        if (z10) {
            aVar = null;
        } else {
            aVar = e.f4129a;
        }
        this.owner$volatile = aVar;
    }

    public final boolean c() {
        if (Math.max(i.f4136f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(ed.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f4136f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                ad.j jVar = ad.j.f401a;
                if (i11 <= 0) {
                    m l4 = e0.l(w6.b(cVar));
                    try {
                        a(new c(this, l4));
                        Object r10 = l4.r();
                        dd.a aVar = dd.a.f5864a;
                        if (r10 != aVar) {
                            r10 = jVar;
                        }
                        if (r10 == aVar) {
                            return r10;
                        }
                        return jVar;
                    } catch (Throwable th2) {
                        l4.A();
                        throw th2;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f4128g.set(this, null);
                    return jVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4128g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ea.a aVar = e.f4129a;
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
        return "Mutex@" + e0.k(this) + "[isLocked=" + c() + ",owner=" + f4128g.get(this) + ']';
    }
}
