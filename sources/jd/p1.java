package jd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class p1 extends od.b {
    public final k1 f11508b;
    public v1 f11509c;
    public final u1 d;
    public final a1 f11510e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.f11510e = a1Var;
        this.f11508b = k1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z10;
        od.l lVar;
        od.l lVar2 = (od.l) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        od.l lVar3 = this.f11508b;
        if (z10) {
            lVar = lVar3;
        } else {
            lVar = this.f11509c;
        }
        if (lVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = od.l.f19523a;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar2, this, lVar)) {
                if (atomicReferenceFieldUpdater.get(lVar2) != this) {
                    return;
                }
            }
            if (z10) {
                od.l lVar4 = this.f11509c;
                kotlin.jvm.internal.j.b(lVar4);
                lVar3.e(lVar4);
            }
        }
    }

    @Override
    public final fc.a c(Object obj) {
        od.l lVar = (od.l) obj;
        if (this.d.u() == this.f11510e) {
            return null;
        }
        return od.a.f19504e;
    }
}
