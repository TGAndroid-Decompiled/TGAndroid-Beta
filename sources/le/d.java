package le;

import a8.pe;
import ce.f0;
import ce.m;
import he.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater f16992g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        v vVar;
        if (z10) {
            vVar = null;
        } else {
            vVar = e.f16993a;
        }
        this.owner$volatile = vVar;
    }

    public final boolean c() {
        if (Math.max(h.f16998f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(nd.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f16998f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                jd.i iVar = jd.i.f15579a;
                if (i11 <= 0) {
                    m l4 = f0.l(pe.b(cVar));
                    try {
                        a(new c(this, l4));
                        Object r6 = l4.r();
                        md.a aVar = md.a.f18411a;
                        if (r6 != aVar) {
                            r6 = iVar;
                        }
                        if (r6 == aVar) {
                            return r6;
                        }
                        return iVar;
                    } catch (Throwable th2) {
                        l4.A();
                        throw th2;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f16992g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16992g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = e.f16993a;
            if (obj2 != vVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
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
        return "Mutex@" + f0.k(this) + "[isLocked=" + c() + ",owner=" + f16992g.get(this) + ']';
    }
}
