package ld;
public final class g2 extends qd.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public g2(uc.c r3, uc.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: ld.g2.<init>(uc.c, uc.h):void");
    }

    public final boolean M() {
        boolean z4;
        if (this.threadLocalIsSet && this.e.get() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e.remove();
        return !z4;
    }

    public final void N(uc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new sc.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            sc.d dVar = (sc.d) this.e.get();
            if (dVar != null) {
                qd.a.f((uc.h) dVar.f44245a, dVar.f44246b);
            }
            this.e.remove();
        }
        Object r10 = e0.r(obj);
        uc.c cVar = this.d;
        uc.h context = cVar.getContext();
        g2 g2Var = null;
        Object k10 = qd.a.k(context, null);
        if (k10 != qd.a.f43016f) {
            g2Var = e0.v(cVar, context, k10);
        }
        try {
            this.d.resumeWith(r10);
            if (g2Var != null && !g2Var.M()) {
                return;
            }
            qd.a.f(context, k10);
        } catch (Throwable th2) {
            if (g2Var == null || g2Var.M()) {
                qd.a.f(context, k10);
            }
            throw th2;
        }
    }
}
