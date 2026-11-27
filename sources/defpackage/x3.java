package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class x3 extends wpd {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public x3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final boolean a(b4 b4Var, w3 w3Var, w3 w3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(b4Var, w3Var, w3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(b4Var) == w3Var);
        return false;
    }

    @Override
    public final boolean b(b4 b4Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(b4Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(b4Var) == obj);
        return false;
    }

    @Override
    public final boolean c(b4 b4Var, a4 a4Var, a4 a4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(b4Var, a4Var, a4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(b4Var) == a4Var);
        return false;
    }

    @Override
    public final void d(a4 a4Var, a4 a4Var2) {
        this.b.lazySet(a4Var, a4Var2);
    }

    @Override
    public final void e(a4 a4Var, Thread thread) {
        this.a.lazySet(a4Var, thread);
    }
}
