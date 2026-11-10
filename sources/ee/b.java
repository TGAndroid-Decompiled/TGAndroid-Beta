package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b {
    public static final AtomicReferenceFieldUpdater f10774a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f10775b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public b(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void b() {
        f10775b.set(this, null);
    }

    public final b c() {
        Object obj = f10774a.get(this);
        if (obj == a.f10768a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean d();

    public final void e() {
        b bVar;
        b c10;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10775b;
            b bVar2 = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar2 != null && bVar2.d()) {
                bVar2 = (b) atomicReferenceFieldUpdater.get(bVar2);
            }
            b c11 = c();
            kotlin.jvm.internal.j.b(c11);
            while (c11.d() && (c10 = c11.c()) != null) {
                c11 = c10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c11);
                if (((b) obj) == null) {
                    bVar = null;
                } else {
                    bVar = bVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c11, obj, bVar)) {
                    if (atomicReferenceFieldUpdater.get(c11) != obj) {
                        break;
                    }
                }
            }
            if (bVar2 != null) {
                f10774a.set(bVar2, c11);
            }
            if (!c11.d() || c11.c() == null) {
                if (bVar2 == null || !bVar2.d()) {
                    return;
                }
            }
        }
    }
}
