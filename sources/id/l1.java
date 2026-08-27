package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class l1 extends nd.k implements e1, p0, b1 {
    public v1 d;

    @Override
    public final w1 c() {
        return null;
    }

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1 v1VarI = i();
        while (true) {
            Object objU = v1VarI.u();
            if (objU instanceof l1) {
                if (objU != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v1.f11206a;
                r0 r0Var = f0.f11146j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(v1VarI, objU, r0Var)) {
                    if (atomicReferenceFieldUpdater2.get(v1VarI) != objU) {
                    }
                }
                return;
            }
            if (!(objU instanceof b1) || ((b1) objU).c() == null) {
                return;
            }
            while (true) {
                Object objF = f();
                if (objF instanceof nd.q) {
                    return;
                }
                if (objF == this) {
                    return;
                }
                kotlin.jvm.internal.j.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                nd.k kVar = (nd.k) objF;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = nd.k.f18495c;
                nd.q qVar = (nd.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new nd.q(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = nd.k.f18493a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objF, qVar)) {
                        kVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objF);
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
        kotlin.jvm.internal.j.h("job");
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
