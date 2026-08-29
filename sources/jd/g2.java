package jd;
public final class g2 extends od.t {
    public final ThreadLocal f11482e;
    private volatile boolean threadLocalIsSet;

    public g2(sc.c r3, sc.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: jd.g2.<init>(sc.c, sc.h):void");
    }

    public final boolean M() {
        boolean z10;
        if (this.threadLocalIsSet && this.f11482e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11482e.remove();
        return !z10;
    }

    public final void N(sc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f11482e.set(new qc.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            qc.d dVar = (qc.d) this.f11482e.get();
            if (dVar != null) {
                od.a.f((sc.h) dVar.f46595a, dVar.f46596b);
            }
            this.f11482e.remove();
        }
        Object r6 = e0.r(obj);
        sc.c cVar = this.d;
        sc.h context = cVar.getContext();
        g2 g2Var = null;
        Object k9 = od.a.k(context, null);
        if (k9 != od.a.f19505f) {
            g2Var = e0.v(cVar, context, k9);
        }
        try {
            this.d.resumeWith(r6);
            if (g2Var != null && !g2Var.M()) {
                return;
            }
            od.a.f(context, k9);
        } catch (Throwable th2) {
            if (g2Var == null || g2Var.M()) {
                od.a.f(context, k9);
            }
            throw th2;
        }
    }
}
