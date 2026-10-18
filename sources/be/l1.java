package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class l1 extends ge.k implements e1, p0, b1 {
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
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v1.f4334a;
                    r0 r0Var = f0.f4287j;
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
                    if (!(f7 instanceof ge.q)) {
                        if (f7 == this) {
                            ge.k kVar = (ge.k) f7;
                            return;
                        }
                        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        ge.k kVar2 = (ge.k) f7;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ge.k.f11032c;
                        ge.q qVar = (ge.q) atomicReferenceFieldUpdater3.get(kVar2);
                        if (qVar == null) {
                            qVar = new ge.q(kVar2);
                            atomicReferenceFieldUpdater3.set(kVar2, qVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = ge.k.f11030a;
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
