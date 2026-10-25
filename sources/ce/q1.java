package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class q1 extends he.b {
    public final l1 f6254b;
    public w1 f6255c;
    public final v1 d;
    public final b1 e;

    public q1(l1 l1Var, v1 v1Var, b1 b1Var) {
        this.d = v1Var;
        this.e = b1Var;
        this.f6254b = l1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z10;
        he.k kVar;
        he.k kVar2 = (he.k) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        he.k kVar3 = this.f6254b;
        if (z10) {
            kVar = kVar3;
        } else {
            kVar = this.f6255c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.k.f12806a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z10) {
                he.k kVar4 = this.f6255c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar3.e(kVar4);
            }
        }
    }

    @Override
    public final he.v c(Object obj) {
        he.k kVar = (he.k) obj;
        if (this.d.u() == this.e) {
            return null;
        }
        return he.a.e;
    }
}
