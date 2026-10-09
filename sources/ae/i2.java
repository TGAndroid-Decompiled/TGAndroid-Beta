package ae;
public final class i2 extends fe.s {
    public final ThreadLocal f467e;
    private volatile boolean threadLocalIsSet;

    public i2(jd.c r3, jd.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: ae.i2.<init>(jd.c, jd.h):void");
    }

    public final boolean M() {
        boolean z10;
        if (this.threadLocalIsSet && this.f467e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f467e.remove();
        return !z10;
    }

    public final void N(jd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f467e.set(new hd.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            hd.d dVar = (hd.d) this.f467e.get();
            if (dVar != null) {
                fe.a.f((jd.h) dVar.f11084a, dVar.f11085b);
            }
            this.f467e.remove();
        }
        Object r10 = g0.r(obj);
        jd.c cVar = this.d;
        jd.h context = cVar.getContext();
        i2 i2Var = null;
        Object k10 = fe.a.k(context, null);
        if (k10 != fe.a.f9887f) {
            i2Var = g0.v(cVar, context, k10);
        }
        try {
            this.d.resumeWith(r10);
            if (i2Var != null && !i2Var.M()) {
                return;
            }
            fe.a.f(context, k10);
        } catch (Throwable th2) {
            if (i2Var == null || i2Var.M()) {
                fe.a.f(context, k10);
            }
            throw th2;
        }
    }
}
