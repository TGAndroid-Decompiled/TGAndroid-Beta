package defpackage;
public final class a28 implements qac {
    public final byte a;
    public final d38 b;

    public a28(d38 d38Var, byte b) {
        this.a = b;
        this.b = d38Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        d38 d38Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                hs1 hs1Var = d38Var.J;
                if (hs1Var != null) {
                    hs1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                d38Var.r = false;
                d38Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    d38Var.A0();
                    d38Var.finishFragment();
                    d38Var.I0();
                    return;
                }
                return;
        }
    }
}
