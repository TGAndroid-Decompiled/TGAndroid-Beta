package hd;
public final class h2 extends md.s {
    public final ThreadLocal f10449e;
    private volatile boolean threadLocalIsSet;

    public h2(qc.c r3, qc.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: hd.h2.<init>(qc.c, qc.h):void");
    }

    public final boolean M() {
        boolean z10;
        if (this.threadLocalIsSet && this.f10449e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10449e.remove();
        return !z10;
    }

    public final void N(qc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f10449e.set(new oc.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            oc.d dVar = (oc.d) this.f10449e.get();
            if (dVar != null) {
                md.a.f((qc.h) dVar.f19189a, dVar.f19190b);
            }
            this.f10449e.remove();
        }
        Object r10 = f0.r(obj);
        qc.c cVar = this.d;
        qc.h context = cVar.getContext();
        h2 h2Var = null;
        Object k10 = md.a.k(context, null);
        if (k10 != md.a.f17642f) {
            h2Var = f0.v(cVar, context, k10);
        }
        try {
            this.d.resumeWith(r10);
            if (h2Var != null && !h2Var.M()) {
                return;
            }
            md.a.f(context, k10);
        } catch (Throwable th) {
            if (h2Var == null || h2Var.M()) {
                md.a.f(context, k10);
            }
            throw th;
        }
    }
}
