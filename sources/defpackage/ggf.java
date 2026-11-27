package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class ggf extends v8f {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public ggf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final fgf a(lgf lgfVar) {
        return (fgf) this.d.getAndSet(lgfVar, fgf.d);
    }

    @Override
    public final jgf b(lgf lgfVar) {
        return (jgf) this.c.getAndSet(lgfVar, jgf.c);
    }

    @Override
    public final void c(jgf jgfVar, jgf jgfVar2) {
        this.b.lazySet(jgfVar, jgfVar2);
    }

    @Override
    public final void d(jgf jgfVar, Thread thread) {
        this.a.lazySet(jgfVar, thread);
    }

    @Override
    public final boolean e(lgf lgfVar, fgf fgfVar, fgf fgfVar2) {
        return x8f.a(this.d, lgfVar, fgfVar, fgfVar2);
    }

    @Override
    public final boolean f(lgf lgfVar, Object obj, Object obj2) {
        return x8f.a(this.e, lgfVar, obj, obj2);
    }

    @Override
    public final boolean g(lgf lgfVar, jgf jgfVar, jgf jgfVar2) {
        return x8f.a(this.c, lgfVar, jgfVar, jgfVar2);
    }
}
