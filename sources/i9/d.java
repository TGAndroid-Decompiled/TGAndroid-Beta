package i9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.k8;
public final class d extends k8 {
    public final AtomicReferenceFieldUpdater f11897a;
    public final AtomicReferenceFieldUpdater f11898b;
    public final AtomicReferenceFieldUpdater f11899c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater f11900e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f11897a = atomicReferenceFieldUpdater;
        this.f11898b = atomicReferenceFieldUpdater2;
        this.f11899c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f11900e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final boolean a(o oVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(oVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oVar) == cVar);
        return false;
    }

    @Override
    public final boolean b(o oVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f11900e;
            if (atomicReferenceFieldUpdater.compareAndSet(oVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oVar) == obj);
        return false;
    }

    @Override
    public final boolean c(o oVar, n nVar, n nVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f11899c;
            if (atomicReferenceFieldUpdater.compareAndSet(oVar, nVar, nVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(oVar) == nVar);
        return false;
    }

    @Override
    public final c d(o oVar) {
        return (c) this.d.getAndSet(oVar, c.d);
    }

    @Override
    public final n e(o oVar) {
        return (n) this.f11899c.getAndSet(oVar, n.f11912c);
    }

    @Override
    public final void f(n nVar, n nVar2) {
        this.f11898b.lazySet(nVar, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        this.f11897a.lazySet(nVar, thread);
    }
}
