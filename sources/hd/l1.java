package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class l1 extends md.k implements e1, p0, b1 {
    public v1 d;

    @Override
    public final w1 c() {
        return null;
    }

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1 i9 = i();
        while (true) {
            Object u10 = i9.u();
            if (u10 instanceof l1) {
                if (u10 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v1.f10497a;
                    r0 r0Var = f0.f10437j;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(i9, u10, r0Var)) {
                        if (atomicReferenceFieldUpdater2.get(i9) != u10) {
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
                    Object f10 = f();
                    if (!(f10 instanceof md.q)) {
                        if (f10 == this) {
                            md.k kVar = (md.k) f10;
                            return;
                        }
                        kotlin.jvm.internal.i.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        md.k kVar2 = (md.k) f10;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = md.k.f17659c;
                        md.q qVar = (md.q) atomicReferenceFieldUpdater3.get(kVar2);
                        if (qVar == null) {
                            qVar = new md.q(kVar2);
                            atomicReferenceFieldUpdater3.set(kVar2, qVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = md.k.f17657a;
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
