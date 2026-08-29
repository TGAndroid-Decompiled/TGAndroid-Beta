package jd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class k1 extends od.l implements d1, o0, a1 {
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
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u1.f11529a;
                    q0 q0Var = e0.f11467j;
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
                    Object f9 = f();
                    if (!(f9 instanceof od.r)) {
                        if (f9 == this) {
                            od.l lVar = (od.l) f9;
                            return;
                        }
                        kotlin.jvm.internal.j.c(f9, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        od.l lVar2 = (od.l) f9;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = od.l.f19525c;
                        od.r rVar = (od.r) atomicReferenceFieldUpdater3.get(lVar2);
                        if (rVar == null) {
                            rVar = new od.r(lVar2);
                            atomicReferenceFieldUpdater3.set(lVar2, rVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = od.l.f19523a;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, f9, rVar)) {
                                lVar2.d();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == f9);
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
