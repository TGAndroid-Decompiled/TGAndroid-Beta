package defpackage;
public final class xz7 implements p8c {
    public final byte a;
    public final a18 b;

    public xz7(a18 a18Var, byte b) {
        this.a = b;
        this.b = a18Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        a18 a18Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                vq1 vq1Var = a18Var.J;
                if (vq1Var != null) {
                    vq1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                a18Var.r = false;
                a18Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    a18Var.z0();
                    a18Var.finishFragment();
                    a18Var.H0();
                    return;
                }
                return;
        }
    }
}
