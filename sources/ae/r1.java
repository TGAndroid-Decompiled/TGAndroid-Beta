package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class r1 extends fe.b {
    public final m1 f494b;
    public x1 f495c;
    public final w1 d;
    public final c1 f496e;

    public r1(m1 m1Var, w1 w1Var, c1 c1Var) {
        this.d = w1Var;
        this.f496e = c1Var;
        this.f494b = m1Var;
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
        fe.k kVar3 = this.f494b;
        if (z10) {
            kVar = kVar3;
        } else {
            kVar = this.f495c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.k.f9900a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z10) {
                fe.k kVar4 = this.f495c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar3.e(kVar4);
            }
        }
    }

    @Override
    public final da.a c(Object obj) {
        fe.k kVar = (fe.k) obj;
        if (this.d.u() == this.f496e) {
            return null;
        }
        return fe.a.f9884e;
    }
}
