package defpackage;
public final class gx0 extends c6 {
    public final byte a;
    public final wx0 b;

    public gx0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    if (!wx0Var.E.A()) {
                        wx0Var.v();
                        return;
                    }
                    return;
                } else if (i == 2131296494) {
                    wx0Var.z0 = true;
                    wx0Var.m(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i == -1) {
                    wx0Var.v();
                    return;
                }
                return;
        }
    }
}
