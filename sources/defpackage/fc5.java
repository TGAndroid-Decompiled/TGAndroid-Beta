package defpackage;

import android.content.Context;
public final class fc5 extends sq4 {
    public final oc5 r;

    public fc5(oc5 oc5Var, Context context, int i) {
        super(context, i);
        this.r = oc5Var;
    }

    @Override
    public final void a(wc5 wc5Var) {
        super.a(wc5Var);
        this.r.v0();
    }

    @Override
    public final void b() {
        super.b();
        this.r.v0();
    }

    @Override
    public final void c(wc5 wc5Var) {
        oc5 oc5Var = this.r;
        if (wc5Var == oc5Var.Y) {
            oc5Var.Y = null;
        }
        if (wc5Var == oc5Var.Z) {
            oc5Var.Z = null;
        }
        super.c(wc5Var);
        oc5Var.v0();
    }
}
