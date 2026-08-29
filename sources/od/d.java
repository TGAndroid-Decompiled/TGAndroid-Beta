package od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class d {
    public static final AtomicReferenceFieldUpdater f19508a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f19509b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public d(u uVar) {
        this._prev$volatile = uVar;
    }

    public final void b() {
        f19509b.set(this, null);
    }

    public final d c() {
        Object obj = f19508a.get(this);
        if (obj == a.f19502b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean d();

    public final void e() {
        d dVar;
        d c3;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19509b;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.d()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d c6 = c();
            kotlin.jvm.internal.j.b(c6);
            while (c6.d() && (c3 = c6.c()) != null) {
                c6 = c3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c6);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c6, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(c6) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f19508a.set(dVar2, c6);
            }
            if (!c6.d() || c6.c() == null) {
                if (dVar2 == null || !dVar2.d()) {
                    return;
                }
            }
        }
    }
}
