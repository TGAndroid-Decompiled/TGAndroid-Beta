package defpackage;
public final class d38 implements pcc {
    public final byte a;
    public final h48 b;

    public d38(h48 h48Var, byte b) {
        this.a = b;
        this.b = h48Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        h48 h48Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                ir1 ir1Var = h48Var.J;
                if (ir1Var != null) {
                    ir1Var.F(num.intValue());
                    return;
                }
                return;
            default:
                h48Var.r = false;
                h48Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    h48Var.A0();
                    h48Var.finishFragment();
                    h48Var.I0();
                    return;
                }
                return;
        }
    }
}
