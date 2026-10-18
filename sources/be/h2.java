package be;
public final class h2 extends ge.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public h2(kd.c r3, kd.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: be.h2.<init>(kd.c, kd.h):void");
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

    public final void N(kd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new id.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            id.d dVar = (id.d) this.e.get();
            if (dVar != null) {
                ge.a.f((kd.h) dVar.f12767a, dVar.f12768b);
            }
            this.e.remove();
        }
        Object r10 = f0.r(obj);
        kd.c cVar = this.d;
        kd.h context = cVar.getContext();
        h2 h2Var = null;
        Object k10 = ge.a.k(context, null);
        if (k10 != ge.a.f11015f) {
            h2Var = f0.v(cVar, context, k10);
        }
        try {
            this.d.resumeWith(r10);
            if (h2Var != null && !h2Var.M()) {
                return;
            }
            ge.a.f(context, k10);
        } catch (Throwable th2) {
            if (h2Var == null || h2Var.M()) {
                ge.a.f(context, k10);
            }
            throw th2;
        }
    }
}
