package hd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class q1 extends md.b {
    public final l1 f10475b;
    public w1 f10476c;
    public final v1 d;
    public final b1 f10477e;

    public q1(l1 l1Var, v1 v1Var, b1 b1Var) {
        this.d = v1Var;
        this.f10477e = b1Var;
        this.f10475b = l1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z10;
        b1 b1Var;
        md.k kVar = (md.k) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l1 l1Var = this.f10475b;
        if (z10) {
            b1Var = l1Var;
        } else {
            b1Var = this.f10476c;
        }
        if (b1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.k.f17657a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, b1Var)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                w1 w1Var = this.f10476c;
                kotlin.jvm.internal.i.b(w1Var);
                l1Var.e(w1Var);
            }
        }
    }

    @Override
    public final e5.c c(Object obj) {
        md.k kVar = (md.k) obj;
        if (this.d.u() == this.f10477e) {
            return null;
        }
        return md.a.f17641e;
    }
}
