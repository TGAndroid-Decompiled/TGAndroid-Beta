package defpackage;
public final class fp1 extends m8 {
    public final t09 o;
    public final mu1 p;

    public fp1(mu1 mu1Var, ye1 ye1Var, t09 t09Var) {
        super(ye1Var, -2, -2);
        this.p = mu1Var;
        this.o = t09Var;
    }

    @Override
    public final void d(boolean z) {
        super.d(z);
        t09 t09Var = this.o;
        if (t09Var != null) {
            t09Var.a(z);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        mu1 mu1Var = this.p;
        if (mu1Var.g9 == this) {
            m21 m21Var = m21.w;
            m21 m21Var2 = mu1Var.C1;
            if (m21Var == m21Var2 && m21Var2 != null) {
                m21Var2.b();
                mu1Var.C1 = null;
            }
            mu1Var.g9 = null;
            mu1Var.l9 = null;
            mu1Var.k9 = null;
            mu1Var.C0.R = true;
            if (mu1Var.h9) {
                mu1Var.r6(false, true, 0.0f);
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
