package defpackage;
public final class x8c extends ju9 {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    public x8c(defpackage.zw2 r3, defpackage.mx2 r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8c.<init>(zw2, mx2):void");
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

    public final void T(mx2 mx2Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new rx7(mx2Var, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            rx7 rx7Var = (rx7) this.f.get();
            if (rx7Var != null) {
                xhd.a((mx2) rx7Var.a, rx7Var.b);
            }
            this.f.remove();
        }
        Object a = pxd.a(obj);
        zw2 zw2Var = this.e;
        mx2 context = zw2Var.getContext();
        x8c x8cVar = null;
        Object c = xhd.c(context, null);
        if (c != xhd.a) {
            x8cVar = g4e.c(zw2Var, context, c);
        }
        try {
            this.e.resumeWith(a);
            if (x8cVar != null && !x8cVar.S()) {
                return;
            }
            xhd.a(context, c);
        } catch (Throwable th) {
            if (x8cVar == null || x8cVar.S()) {
                xhd.a(context, c);
            }
            throw th;
        }
    }
}
