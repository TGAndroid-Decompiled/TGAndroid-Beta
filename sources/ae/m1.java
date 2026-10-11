package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class m1 extends fe.k implements f1, q0, c1 {
    public w1 d;

    @Override
    public final x1 c() {
        return null;
    }

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof m1) {
                if (u10 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w1.f514a;
                    s0 s0Var = g0.f457j;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, s0Var)) {
                        if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                            break;
                        }
                    }
                    return;
                }
                return;
            } else if (!(u10 instanceof c1) || ((c1) u10).c() == null) {
                return;
            } else {
                while (true) {
                    Object f7 = f();
                    if (!(f7 instanceof fe.q)) {
                        if (f7 == this) {
                            fe.k kVar = (fe.k) f7;
                            return;
                        }
                        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        fe.k kVar2 = (fe.k) f7;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = fe.k.f9903c;
                        fe.q qVar = (fe.q) atomicReferenceFieldUpdater3.get(kVar2);
                        if (qVar == null) {
                            qVar = new fe.q(kVar2);
                            atomicReferenceFieldUpdater3.set(kVar2, qVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = fe.k.f9901a;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, f7, qVar)) {
                                kVar2.d();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == f7);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public h1 getParent() {
        return i();
    }

    public final w1 i() {
        w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var;
        }
        kotlin.jvm.internal.i.h("job");
        throw null;
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.k(this) + "[job@" + g0.k(i()) + ']';
    }
}
