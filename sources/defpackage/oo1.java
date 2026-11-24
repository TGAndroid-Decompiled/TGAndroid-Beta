package defpackage;
public final class oo1 implements we7 {
    public final byte a;
    public final yv1 b;

    public oo1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                if (yv1Var.getParentActivity() != null && yv1Var.fragmentView != null && i > 0) {
                    c41.b0(yv1Var).m(b41.r, i, 0, 0, yv1Var.Ba).j();
                    return;
                }
                return;
            case 1:
                yv1 yv1Var2 = this.b;
                if (i == 0) {
                    yv1Var2.E6 = false;
                    yv1Var2.W9();
                    return;
                }
                yv1Var2.J(i, 0, 0, 0, false, true);
                return;
            default:
                if (i == 0) {
                    yv1Var.zd(true);
                    return;
                } else {
                    yv1Var.finishFragment();
                    return;
                }
        }
    }
}
