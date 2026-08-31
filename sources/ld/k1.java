package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class k1 extends qd.k implements d1, o0, a1 {
    public u1 d;

    @Override
    public final v1 c() {
        return null;
    }

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof k1) {
                if (u10 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u1.f12365a;
                    q0 q0Var = e0.f12303j;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, q0Var)) {
                        if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                            break;
                        }
                    }
                    return;
                }
                return;
            } else if (!(u10 instanceof a1) || ((a1) u10).c() == null) {
                return;
            } else {
                while (true) {
                    Object f10 = f();
                    if (!(f10 instanceof qd.q)) {
                        if (f10 == this) {
                            qd.k kVar = (qd.k) f10;
                            return;
                        }
                        kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        qd.k kVar2 = (qd.k) f10;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = qd.k.f44809c;
                        qd.q qVar = (qd.q) atomicReferenceFieldUpdater3.get(kVar2);
                        if (qVar == null) {
                            qVar = new qd.q(kVar2);
                            atomicReferenceFieldUpdater3.set(kVar2, qVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = qd.k.f44807a;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, f10, qVar)) {
                                kVar2.d();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == f10);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public f1 getParent() {
        return i();
    }

    public final u1 i() {
        u1 u1Var = this.d;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.j.h("job");
        throw null;
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this) + "[job@" + e0.k(i()) + ']';
    }
}
