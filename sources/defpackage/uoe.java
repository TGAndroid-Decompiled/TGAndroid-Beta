package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class uoe extends g3f {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public uoe(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final void a(a2f a2fVar, a2f a2fVar2) {
        this.b.lazySet(a2fVar, a2fVar2);
    }

    @Override
    public final void b(a2f a2fVar, Thread thread) {
        this.a.lazySet(a2fVar, thread);
    }

    @Override
    public final boolean c(a7f a7fVar, hee heeVar, hee heeVar2) {
        return o4f.a(this.d, a7fVar, heeVar, heeVar2);
    }

    @Override
    public final boolean d(a7f a7fVar, Object obj, Object obj2) {
        return o4f.a(this.e, a7fVar, obj, obj2);
    }

    @Override
    public final boolean e(a7f a7fVar, a2f a2fVar, a2f a2fVar2) {
        return o4f.a(this.c, a7fVar, a2fVar, a2fVar2);
    }
}
