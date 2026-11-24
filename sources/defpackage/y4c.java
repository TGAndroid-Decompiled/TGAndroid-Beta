package defpackage;
public final class y4c extends rq9 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    public y4c(defpackage.fw2 r3, defpackage.sw2 r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4c.<init>(fw2, sw2):void");
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

    public final void T(sw2 sw2Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new ku7(sw2Var, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            ku7 ku7Var = (ku7) this.f.get();
            if (ku7Var != null) {
                edd.a((sw2) ku7Var.a, ku7Var.b);
            }
            this.f.remove();
        }
        Object a = zsd.a(obj);
        fw2 fw2Var = this.e;
        sw2 context = fw2Var.getContext();
        y4c y4cVar = null;
        Object c = edd.c(context, null);
        if (c != edd.a) {
            y4cVar = qzd.c(fw2Var, context, c);
        }
        try {
            this.e.resumeWith(a);
            if (y4cVar != null && !y4cVar.S()) {
                return;
            }
            edd.a(context, c);
        } catch (Throwable th) {
            if (y4cVar == null || y4cVar.S()) {
                edd.a(context, c);
            }
            throw th;
        }
    }
}
