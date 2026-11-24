package defpackage;
public final class hr1 extends m8 {
    public final yv1 o;

    public hr1(yv1 yv1Var, fr1 fr1Var) {
        super(fr1Var, -2, -2);
        this.o = yv1Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        yv1 yv1Var = this.o;
        if (yv1Var.g9 == this) {
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
