package nd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class d {

    public static final AtomicReferenceFieldUpdater f18481a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");

    public static final AtomicReferenceFieldUpdater f18482b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public d(t tVar) {
        this._prev$volatile = tVar;
    }

    public final void b() {
        f18482b.set(this, null);
    }

    public final d c() {
        Object obj = f18481a.get(this);
        if (obj == a.f18475b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean d();

    public final void e() {
        d dVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18482b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.d()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d dVarC2 = c();
            kotlin.jvm.internal.j.b(dVarC2);
            while (dVarC2.d() && (dVarC = dVarC2.c()) != null) {
                dVarC2 = dVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(dVarC2);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(dVarC2, obj, dVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(dVarC2) != obj) {
                    }
                }
            }
            if (dVar != null) {
                f18481a.set(dVar, dVarC2);
            }
            if (!dVarC2.d() || dVarC2.c() == null) {
                if (dVar == null || !dVar.d()) {
                    return;
                }
            }
        }
    }
}
