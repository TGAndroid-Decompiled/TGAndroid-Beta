package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class ire extends x5f {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public ire(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final void a(p4f p4fVar, p4f p4fVar2) {
        this.b.lazySet(p4fVar, p4fVar2);
    }

    @Override
    public final void b(p4f p4fVar, Thread thread) {
        this.a.lazySet(p4fVar, thread);
    }

    @Override
    public final boolean c(p9f p9fVar, wge wgeVar, wge wgeVar2) {
        return f7f.a(this.d, p9fVar, wgeVar, wgeVar2);
    }

    @Override
    public final boolean d(p9f p9fVar, Object obj, Object obj2) {
        return f7f.a(this.e, p9fVar, obj, obj2);
    }

    @Override
    public final boolean e(p9f p9fVar, p4f p4fVar, p4f p4fVar2) {
        return f7f.a(this.c, p9fVar, p4fVar, p4fVar2);
    }
}
