package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class l2 extends qkd {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public l2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final boolean a(t2 t2Var, k2 k2Var, k2 k2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(t2Var, k2Var, k2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(t2Var) == k2Var);
        return false;
    }

    @Override
    public final boolean b(t2 t2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(t2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(t2Var) == obj);
        return false;
    }

    @Override
    public final boolean c(t2 t2Var, s2 s2Var, s2 s2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(t2Var, s2Var, s2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(t2Var) == s2Var);
        return false;
    }

    @Override
    public final k2 d(t2 t2Var) {
        return (k2) this.d.getAndSet(t2Var, k2.d);
    }

    @Override
    public final s2 e(t2 t2Var) {
        return (s2) this.c.getAndSet(t2Var, s2.c);
    }

    @Override
    public final void f(s2 s2Var, s2 s2Var2) {
        this.b.lazySet(s2Var, s2Var2);
    }

    @Override
    public final void g(s2 s2Var, Thread thread) {
        this.a.lazySet(s2Var, thread);
    }
}
