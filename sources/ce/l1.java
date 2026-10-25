package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class l1 extends he.k implements e1, p0, b1 {
    public v1 d;

    @Override
    public final w1 c() {
        return null;
    }

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof l1) {
                if (u10 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v1.f6273a;
                    r0 r0Var = f0.f6226j;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, r0Var)) {
                        if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                            break;
                        }
                    }
                    return;
                }
                return;
            } else if (!(u10 instanceof b1) || ((b1) u10).c() == null) {
                return;
            } else {
                while (true) {
                    Object f7 = f();
                    if (!(f7 instanceof he.q)) {
                        if (f7 == this) {
                            he.k kVar = (he.k) f7;
                            return;
                        }
                        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        he.k kVar2 = (he.k) f7;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = he.k.f12808c;
                        he.q qVar = (he.q) atomicReferenceFieldUpdater3.get(kVar2);
                        if (qVar == null) {
                            qVar = new he.q(kVar2);
                            atomicReferenceFieldUpdater3.set(kVar2, qVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = he.k.f12806a;
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

    public g1 getParent() {
        return i();
    }

    public final v1 i() {
        v1 v1Var = this.d;
        if (v1Var != null) {
            return v1Var;
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
        return getClass().getSimpleName() + '@' + f0.k(this) + "[job@" + f0.k(i()) + ']';
    }
}
