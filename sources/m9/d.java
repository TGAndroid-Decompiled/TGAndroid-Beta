package m9;

import c8.r9;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class d extends r9 {
    public final AtomicReferenceFieldUpdater f19973a;
    public final AtomicReferenceFieldUpdater f19974b;
    public final AtomicReferenceFieldUpdater f19975c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater f19976e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19973a = atomicReferenceFieldUpdater;
        this.f19974b = atomicReferenceFieldUpdater2;
        this.f19975c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f19976e = atomicReferenceFieldUpdater5;
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
            atomicReferenceFieldUpdater = this.f19976e;
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
            atomicReferenceFieldUpdater = this.f19975c;
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
        return (n) this.f19975c.getAndSet(oVar, n.f19989c);
    }

    @Override
    public final void f(n nVar, n nVar2) {
        this.f19974b.lazySet(nVar, nVar2);
    }

    @Override
    public final void g(n nVar, Thread thread) {
        this.f19973a.lazySet(nVar, thread);
    }
}
