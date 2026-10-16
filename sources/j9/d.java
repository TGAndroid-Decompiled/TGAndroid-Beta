package j9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.p8;
public final class d extends p8 {
    public final AtomicReferenceFieldUpdater f12921a;
    public final AtomicReferenceFieldUpdater f12922b;
    public final AtomicReferenceFieldUpdater f12923c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f12921a = atomicReferenceFieldUpdater;
        this.f12922b = atomicReferenceFieldUpdater2;
        this.f12923c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
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
            atomicReferenceFieldUpdater = this.e;
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
            atomicReferenceFieldUpdater = this.f12923c;
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
        return (n) this.f12923c.getAndSet(oVar, n.f12935c);
    }

    @Override
    public final void f(n nVar, n nVar2) {
        this.f12922b.lazySet(nVar, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        this.f12921a.lazySet(nVar, thread);
    }
}
