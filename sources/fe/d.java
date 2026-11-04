package fe;

import b8.jc;
import be.t;
import dd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.b0;
import wd.m;
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater f11572g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile = e.f11573a;

    public final boolean c() {
        if (Math.max(h.f11579f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(hd.c cVar) {
        boolean e10 = e();
        k kVar = k.f8801a;
        if (!e10) {
            m l10 = b0.l(jc.b(cVar));
            try {
                a(new c(this, l10));
                Object r5 = l10.r();
                gd.a aVar = gd.a.f12241a;
                if (r5 != aVar) {
                    r5 = kVar;
                }
                if (r5 == aVar) {
                    return r5;
                }
            } catch (Throwable th2) {
                l10.A();
                throw th2;
            }
        }
        return kVar;
    }

    public final boolean e() {
        int i3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f11579f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f11572g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11572g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = e.f11573a;
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
        return "Mutex@" + b0.j(this) + "[isLocked=" + c() + ",owner=" + f11572g.get(this) + ']';
    }
}
