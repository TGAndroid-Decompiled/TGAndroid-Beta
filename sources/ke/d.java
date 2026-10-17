package ke;

import be.f0;
import be.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w7.n;
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater f15028g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        com.google.android.gms.internal.clearcut.e eVar;
        if (z10) {
            eVar = null;
        } else {
            eVar = e.f15029a;
        }
        this.owner$volatile = eVar;
    }

    public final boolean c() {
        if (Math.max(h.f15034f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(md.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f15034f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                id.i iVar = id.i.f12779a;
                if (i11 <= 0) {
                    m l4 = f0.l(n.b(cVar));
                    try {
                        a(new c(this, l4));
                        Object r10 = l4.r();
                        ld.a aVar = ld.a.f15993a;
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
                    f15028g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15028g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            com.google.android.gms.internal.clearcut.e eVar = e.f15029a;
            if (obj2 != eVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, eVar)) {
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
        return "Mutex@" + f0.k(this) + "[isLocked=" + c() + ",owner=" + f15028g.get(this) + ']';
    }
}
