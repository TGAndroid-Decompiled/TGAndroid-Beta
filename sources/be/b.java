package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b {
    public static final AtomicReferenceFieldUpdater f3257a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f3258b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public b(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void b() {
        f3258b.set(this, null);
    }

    public final b c() {
        Object obj = f3257a.get(this);
        if (obj == a.f3251a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean d();

    public final void e() {
        b bVar;
        b c2;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3258b;
            b bVar2 = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar2 != null && bVar2.d()) {
                bVar2 = (b) atomicReferenceFieldUpdater.get(bVar2);
            }
            b c10 = c();
            kotlin.jvm.internal.j.b(c10);
            while (c10.d() && (c2 = c10.c()) != null) {
                c10 = c2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c10);
                if (((b) obj) == null) {
                    bVar = null;
                } else {
                    bVar = bVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c10, obj, bVar)) {
                    if (atomicReferenceFieldUpdater.get(c10) != obj) {
                        break;
                    }
                }
            }
            if (bVar2 != null) {
                f3257a.set(bVar2, c10);
            }
            if (!c10.d() || c10.c() == null) {
                if (bVar2 == null || !bVar2.d()) {
                    return;
                }
            }
        }
    }
}
