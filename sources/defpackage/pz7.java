package defpackage;
public final class pz7 implements ee {
    public final byte a;
    public final tz7 b;

    public pz7(tz7 tz7Var, byte b) {
        this.a = b;
        this.b = tz7Var;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        tz7 tz7Var = this.b;
        switch (b) {
            case 0:
                tz7Var.d(true);
                tz7Var.R.N1(null, 0, true);
                return;
            default:
                tz7Var.d(true);
                tz7Var.R.finishFragment();
                return;
        }
    }
}
