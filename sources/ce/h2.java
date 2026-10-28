package ce;
public final class h2 extends he.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public h2(ld.c r3, ld.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: ce.h2.<init>(ld.c, ld.h):void");
    }

    public final boolean M() {
        boolean z10;
        if (this.threadLocalIsSet && this.e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e.remove();
        return !z10;
    }

    public final void N(ld.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new jd.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            jd.d dVar = (jd.d) this.e.get();
            if (dVar != null) {
                he.a.f((ld.h) dVar.f15571a, dVar.f15572b);
            }
            this.e.remove();
        }
        Object r6 = f0.r(obj);
        ld.c cVar = this.d;
        ld.h context = cVar.getContext();
        h2 h2Var = null;
        Object k10 = he.a.k(context, null);
        if (k10 != he.a.f12792f) {
            h2Var = f0.v(cVar, context, k10);
        }
        try {
            this.d.resumeWith(r6);
            if (h2Var != null && !h2Var.M()) {
                return;
            }
            he.a.f(context, k10);
        } catch (Throwable th2) {
            if (h2Var == null || h2Var.M()) {
                he.a.f(context, k10);
            }
            throw th2;
        }
    }
}
