package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class w3 extends fld {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public w3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final boolean a(a4 a4Var, v3 v3Var, v3 v3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(a4Var, v3Var, v3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(a4Var) == v3Var);
        return false;
    }

    @Override
    public final boolean b(a4 a4Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(a4Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(a4Var) == obj);
        return false;
    }

    @Override
    public final boolean c(a4 a4Var, z3 z3Var, z3 z3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(a4Var, z3Var, z3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(a4Var) == z3Var);
        return false;
    }

    @Override
    public final void d(z3 z3Var, z3 z3Var2) {
        this.b.lazySet(z3Var, z3Var2);
    }

    @Override
    public final void e(z3 z3Var, Thread thread) {
        this.a.lazySet(z3Var, thread);
    }
}
