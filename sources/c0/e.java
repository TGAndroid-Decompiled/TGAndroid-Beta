package c0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.d5;
public final class e extends d5 {
    public final AtomicReferenceFieldUpdater f3914a;
    public final AtomicReferenceFieldUpdater f3915b;
    public final AtomicReferenceFieldUpdater f3916c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater f3917e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3914a = atomicReferenceFieldUpdater;
        this.f3915b = atomicReferenceFieldUpdater2;
        this.f3916c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f3917e = atomicReferenceFieldUpdater5;
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
            atomicReferenceFieldUpdater = this.f3917e;
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
            atomicReferenceFieldUpdater = this.f3916c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override
    public final void d(g gVar, g gVar2) {
        this.f3915b.lazySet(gVar, gVar2);
    }

    @Override
    public final void e(g gVar, Thread thread) {
        this.f3914a.lazySet(gVar, thread);
    }
}
