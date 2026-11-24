package defpackage;
public final class sq1 extends m8 {
    public final v29 o;
    public final yv1 p;

    public sq1(yv1 yv1Var, gg1 gg1Var, v29 v29Var) {
        super(gg1Var, -2, -2);
        this.p = yv1Var;
        this.o = v29Var;
    }

    @Override
    public final void d(boolean z) {
        super.d(z);
        v29 v29Var = this.o;
        if (v29Var != null) {
            v29Var.a(z);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        yv1 yv1Var = this.p;
        if (yv1Var.g9 == this) {
            u31 u31Var = u31.x;
            u31 u31Var2 = yv1Var.C1;
            if (u31Var == u31Var2 && u31Var2 != null) {
                u31Var2.b();
                yv1Var.C1 = null;
            }
            yv1Var.g9 = null;
            yv1Var.l9 = null;
            yv1Var.k9 = null;
            yv1Var.C0.R = true;
            if (yv1Var.h9) {
                yv1Var.y6(false, true, 0.0f);
            } else {
                yv1Var.h9 = true;
            }
            ms1 ms1Var = yv1Var.a0;
            if (ms1Var != null && ms1Var.getEditField() != null) {
                yv1Var.a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
