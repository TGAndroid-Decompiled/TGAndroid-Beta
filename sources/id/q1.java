package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class q1 extends nd.b {

    public final l1 f11184b;

    public w1 f11185c;
    public final v1 d;

    public final b1 f11186e;

    public q1(l1 l1Var, v1 v1Var, b1 b1Var) {
        this.d = v1Var;
        this.f11186e = b1Var;
        this.f11184b = l1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        nd.k kVar = (nd.k) obj;
        boolean z10 = obj2 == null;
        nd.k kVar2 = this.f11184b;
        nd.k kVar3 = z10 ? kVar2 : this.f11185c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.k.f18493a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                nd.k kVar4 = this.f11185c;
                kotlin.jvm.internal.j.b(kVar4);
                kVar2.e(kVar4);
            }
        }
    }

    @Override
    public final ec.a c(Object obj) {
        if (this.d.u() == this.f11186e) {
            return null;
        }
        return nd.a.f18477e;
    }
}
