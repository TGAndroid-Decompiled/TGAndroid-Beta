package ie;

import c8.x0;
import ee.t;
import gd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.m;
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater f16259g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile = e.f16260a;

    public final boolean c() {
        if (Math.max(h.f16266f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(kd.c cVar) {
        boolean e10 = e();
        k kVar = k.f13517a;
        if (!e10) {
            m l10 = b0.l(x0.b(cVar));
            try {
                a(new c(this, l10));
                Object r10 = l10.r();
                jd.a aVar = jd.a.f17409a;
                if (r10 != aVar) {
                    r10 = kVar;
                }
                if (r10 == aVar) {
                    return r10;
                }
            } catch (Throwable th2) {
                l10.A();
                throw th2;
            }
        }
        return kVar;
    }

    public final boolean e() {
        int i7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f16266f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f16259g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16259g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = e.f16260a;
            if (obj2 != tVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
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
        return "Mutex@" + b0.j(this) + "[isLocked=" + c() + ",owner=" + f16259g.get(this) + ']';
    }
}
