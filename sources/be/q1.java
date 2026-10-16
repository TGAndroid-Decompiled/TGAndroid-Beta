package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class q1 extends ge.b {
    public final l1 f2702b;
    public w1 f2703c;
    public final v1 d;
    public final b1 e;

    public q1(l1 l1Var, v1 v1Var, b1 b1Var) {
        this.d = v1Var;
        this.e = b1Var;
        this.f2702b = l1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z10;
        b1 b1Var;
        ge.k kVar = (ge.k) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l1 l1Var = this.f2702b;
        if (z10) {
            b1Var = l1Var;
        } else {
            b1Var = this.f2703c;
        }
        if (b1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.k.f10124a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, b1Var)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                w1 w1Var = this.f2703c;
                kotlin.jvm.internal.i.b(w1Var);
                l1Var.e(w1Var);
            }
        }
    }

    @Override
    public final a6.i c(Object obj) {
        ge.k kVar = (ge.k) obj;
        if (this.d.u() == this.e) {
            return null;
        }
        return ge.a.e;
    }
}
