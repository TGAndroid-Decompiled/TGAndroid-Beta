package defpackage;
public final class cn1 implements df7 {
    public final byte a;
    public final zu1 b;

    public cn1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                if (zu1Var.getParentActivity() != null && zu1Var.fragmentView != null && i > 0) {
                    d31.b0(zu1Var).m(c31.r, i, 0, 0, zu1Var.Ba).j();
                    return;
                }
                return;
            case 1:
                zu1 zu1Var2 = this.b;
                if (i == 0) {
                    zu1Var2.E6 = false;
                    zu1Var2.X9();
                    return;
                }
                zu1Var2.J(i, 0, 0, 0, false, true);
                return;
            default:
                if (i == 0) {
                    zu1Var.zd(true);
                    return;
                } else {
                    zu1Var.finishFragment();
                    return;
                }
        }
    }
}
