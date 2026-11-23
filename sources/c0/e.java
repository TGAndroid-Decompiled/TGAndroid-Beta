package c0;

import a8.q7;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class e extends q7 {
    public final AtomicReferenceFieldUpdater f4360a;
    public final AtomicReferenceFieldUpdater f4361b;
    public final AtomicReferenceFieldUpdater f4362c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater f4363e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4360a = atomicReferenceFieldUpdater;
        this.f4361b = atomicReferenceFieldUpdater2;
        this.f4362c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f4363e = atomicReferenceFieldUpdater5;
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
            atomicReferenceFieldUpdater = this.f4363e;
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
            atomicReferenceFieldUpdater = this.f4362c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override
    public final void d(g gVar, g gVar2) {
        this.f4361b.lazySet(gVar, gVar2);
    }

    @Override
    public final void e(g gVar, Thread thread) {
        this.f4360a.lazySet(gVar, thread);
    }
}
