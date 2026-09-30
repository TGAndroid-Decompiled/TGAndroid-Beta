package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class d {
    public static final AtomicReferenceFieldUpdater f8159a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f8160b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public d(t tVar) {
        this._prev$volatile = tVar;
    }

    public final void b() {
        f8160b.set(this, null);
    }

    public final d c() {
        Object obj = f8159a.get(this);
        if (obj == a.f8154b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean d();

    public final void e() {
        d dVar;
        d c10;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8160b;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.d()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d c11 = c();
            kotlin.jvm.internal.i.b(c11);
            while (c11.d() && (c10 = c11.c()) != null) {
                c11 = c10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c11);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c11, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(c11) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f8159a.set(dVar2, c11);
            }
            if (!c11.d() || c11.c() == null) {
                if (dVar2 == null || !dVar2.d()) {
                    return;
                }
            }
        }
    }
}
