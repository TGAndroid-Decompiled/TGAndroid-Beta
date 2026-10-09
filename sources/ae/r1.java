package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class r1 extends fe.b {
    public final m1 f492b;
    public x1 f493c;
    public final w1 d;
    public final c1 f494e;

    public r1(m1 m1Var, w1 w1Var, c1 c1Var) {
        this.d = w1Var;
        this.f494e = c1Var;
        this.f492b = m1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z10;
        fe.k kVar;
        fe.k kVar2 = (fe.k) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        fe.k kVar3 = this.f492b;
        if (z10) {
            kVar = kVar3;
        } else {
            kVar = this.f493c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.k.f9902a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z10) {
                fe.k kVar4 = this.f493c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar3.e(kVar4);
            }
        }
    }

    @Override
    public final da.a c(Object obj) {
        fe.k kVar = (fe.k) obj;
        if (this.d.u() == this.f494e) {
            return null;
        }
        return fe.a.f9886e;
    }
}
