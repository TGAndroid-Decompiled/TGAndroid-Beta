package c0;

import a8.n7;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class e extends n7 {
    public final AtomicReferenceFieldUpdater f5226a;
    public final AtomicReferenceFieldUpdater f5227b;
    public final AtomicReferenceFieldUpdater f5228c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater f5229e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5226a = atomicReferenceFieldUpdater;
        this.f5227b = atomicReferenceFieldUpdater2;
        this.f5228c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f5229e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final boolean a(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override
    public final boolean b(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5229e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override
    public final boolean c(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5228c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override
    public final void d(g gVar, g gVar2) {
        this.f5227b.lazySet(gVar, gVar2);
    }

    @Override
    public final void e(g gVar, Thread thread) {
        this.f5226a.lazySet(gVar, thread);
    }
}
