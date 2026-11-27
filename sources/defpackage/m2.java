package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m2 extends hpd {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public m2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final boolean a(u2 u2Var, l2 l2Var, l2 l2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, l2Var, l2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == l2Var);
        return false;
    }

    @Override
    public final boolean b(u2 u2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == obj);
        return false;
    }

    @Override
    public final boolean c(u2 u2Var, t2 t2Var, t2 t2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, t2Var, t2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == t2Var);
        return false;
    }

    @Override
    public final l2 d(u2 u2Var) {
        return (l2) this.d.getAndSet(u2Var, l2.d);
    }

    @Override
    public final t2 e(u2 u2Var) {
        return (t2) this.c.getAndSet(u2Var, t2.c);
    }

    @Override
    public final void f(t2 t2Var, t2 t2Var2) {
        this.b.lazySet(t2Var, t2Var2);
    }

    @Override
    public final void g(t2 t2Var, Thread thread) {
        this.a.lazySet(t2Var, thread);
    }
}
