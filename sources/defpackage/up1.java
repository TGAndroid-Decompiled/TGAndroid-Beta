package defpackage;
public final class up1 extends m8 {
    public final mu1 o;

    public up1(mu1 mu1Var, sp1 sp1Var) {
        super(sp1Var, -2, -2);
        this.o = mu1Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        mu1 mu1Var = this.o;
        if (mu1Var.g9 == this) {
            mu1Var.g9 = null;
            mu1Var.l9 = null;
            mu1Var.k9 = null;
            mu1Var.C0.R = true;
            if (mu1Var.h9) {
                mu1Var.p6(false, true, 0.0f);
            } else {
                mu1Var.h9 = true;
            }
            ar1 ar1Var = mu1Var.a0;
            if (ar1Var != null && ar1Var.getEditField() != null) {
                mu1Var.a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
