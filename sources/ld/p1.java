package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class p1 extends qd.b {
    public final k1 f12344b;
    public v1 f12345c;
    public final u1 d;
    public final a1 f12346e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.f12346e = a1Var;
        this.f12344b = k1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z4;
        qd.k kVar;
        qd.k kVar2 = (qd.k) obj;
        if (obj2 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        qd.k kVar3 = this.f12344b;
        if (z4) {
            kVar = kVar3;
        } else {
            kVar = this.f12345c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.k.f44807a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z4) {
                qd.k kVar4 = this.f12345c;
                kotlin.jvm.internal.j.b(kVar4);
                kVar3.e(kVar4);
            }
        }
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e c(Object obj) {
        qd.k kVar = (qd.k) obj;
        if (this.d.u() == this.f12346e) {
            return null;
        }
        return qd.a.f44791e;
    }
}
