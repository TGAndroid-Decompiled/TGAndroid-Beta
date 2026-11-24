package defpackage;
public final class y6c extends ss9 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    public y6c(defpackage.px2 r3, defpackage.cy2 r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6c.<init>(px2, cy2):void");
    }

    public final boolean S() {
        boolean z;
        if (this.threadLocalIsSet && this.f.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.f.remove();
        return !z;
    }

    public final void T(cy2 cy2Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new lw7(cy2Var, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            lw7 lw7Var = (lw7) this.f.get();
            if (lw7Var != null) {
                gfd.a((cy2) lw7Var.a, lw7Var.b);
            }
            this.f.remove();
        }
        Object a = cvd.a(obj);
        px2 px2Var = this.e;
        cy2 context = px2Var.getContext();
        y6c y6cVar = null;
        Object c = gfd.c(context, null);
        if (c != gfd.a) {
            y6cVar = t1e.c(px2Var, context, c);
        }
        try {
            this.e.resumeWith(a);
            if (y6cVar != null && !y6cVar.S()) {
                return;
            }
            gfd.a(context, c);
        } catch (Throwable th) {
            if (y6cVar == null || y6cVar.S()) {
                gfd.a(context, c);
            }
            throw th;
        }
    }
}
