package defpackage;
public final class an1 implements uc7 {
    public final byte a;
    public final mu1 b;

    public an1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                if (mu1Var.getParentActivity() != null && mu1Var.fragmentView != null && i > 0) {
                    u21.b0(mu1Var).m(t21.r, i, 0, 0, mu1Var.Ba).j();
                    return;
                }
                return;
            case 1:
                mu1 mu1Var2 = this.b;
                if (i == 0) {
                    mu1Var2.E6 = false;
                    mu1Var2.M9();
                    return;
                }
                mu1Var2.J(i, 0, 0, 0, false, true);
                return;
            default:
                if (i == 0) {
                    mu1Var.nd(true);
                    return;
                } else {
                    mu1Var.finishFragment();
                    return;
                }
        }
    }
}
