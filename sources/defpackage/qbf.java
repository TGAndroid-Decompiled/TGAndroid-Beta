package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class qbf extends c4f {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public qbf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final pbf a(vbf vbfVar) {
        return (pbf) this.d.getAndSet(vbfVar, pbf.d);
    }

    @Override
    public final tbf b(vbf vbfVar) {
        return (tbf) this.c.getAndSet(vbfVar, tbf.c);
    }

    @Override
    public final void c(tbf tbfVar, tbf tbfVar2) {
        this.b.lazySet(tbfVar, tbfVar2);
    }

    @Override
    public final void d(tbf tbfVar, Thread thread) {
        this.a.lazySet(tbfVar, thread);
    }

    @Override
    public final boolean e(vbf vbfVar, pbf pbfVar, pbf pbfVar2) {
        return e4f.a(this.d, vbfVar, pbfVar, pbfVar2);
    }

    @Override
    public final boolean f(vbf vbfVar, Object obj, Object obj2) {
        return e4f.a(this.e, vbfVar, obj, obj2);
    }

    @Override
    public final boolean g(vbf vbfVar, tbf tbfVar, tbf tbfVar2) {
        return e4f.a(this.c, vbfVar, tbfVar, tbfVar2);
    }
}
