package c0;

import h7.i5;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class e extends i5 {
    public final AtomicReferenceFieldUpdater f2729a;
    public final AtomicReferenceFieldUpdater f2730b;
    public final AtomicReferenceFieldUpdater f2731c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater f2732e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2729a = atomicReferenceFieldUpdater;
        this.f2730b = atomicReferenceFieldUpdater2;
        this.f2731c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f2732e = atomicReferenceFieldUpdater5;
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
            atomicReferenceFieldUpdater = this.f2732e;
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
            atomicReferenceFieldUpdater = this.f2731c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override
    public final void d(g gVar, g gVar2) {
        this.f2730b.lazySet(gVar, gVar2);
    }

    @Override
    public final void e(g gVar, Thread thread) {
        this.f2729a.lazySet(gVar, thread);
    }
}
