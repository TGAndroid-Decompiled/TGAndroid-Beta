package ie;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.t8;
import zd.e0;
import zd.m;
public final class d extends i implements a {
    public static final AtomicReferenceFieldUpdater f11959g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        d9.f fVar;
        if (z10) {
            fVar = null;
        } else {
            fVar = e.f11960a;
        }
        this.owner$volatile = fVar;
    }

    public final boolean c() {
        if (Math.max(i.f11968f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(kd.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f11968f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                gd.i iVar = gd.i.f10588a;
                if (i11 <= 0) {
                    m l4 = e0.l(t8.b(cVar));
                    try {
                        a(new c(this, l4));
                        Object r10 = l4.r();
                        jd.a aVar = jd.a.f13614a;
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
                    f11959g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11959g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            d9.f fVar = e.f11960a;
            if (obj2 != fVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, fVar)) {
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
        return "Mutex@" + e0.k(this) + "[isLocked=" + c() + ",owner=" + f11959g.get(this) + ']';
    }
}
