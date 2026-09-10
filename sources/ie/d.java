package ie;

import ee.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.e0;
import zd.m;
public final class d extends i implements a {
    public static final AtomicReferenceFieldUpdater f10570g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        v vVar;
        if (z10) {
            vVar = null;
        } else {
            vVar = e.f10571a;
        }
        this.owner$volatile = vVar;
    }

    public final boolean c() {
        if (Math.max(i.f10578f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(kd.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f10578f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                gd.i iVar = gd.i.f8748a;
                if (i11 <= 0) {
                    m l4 = e0.l(w7.g.b(cVar));
                    try {
                        a(new c(this, l4));
                        Object r10 = l4.r();
                        jd.a aVar = jd.a.f11861a;
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
                    f10570g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10570g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = e.f10571a;
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
        return "Mutex@" + e0.k(this) + "[isLocked=" + c() + ",owner=" + f10570g.get(this) + ']';
    }
}
