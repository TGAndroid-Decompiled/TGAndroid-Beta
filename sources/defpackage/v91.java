package defpackage;
public final class v91 implements yr3 {
    public final byte a;
    public final da1 b;

    public v91(da1 da1Var, byte b) {
        this.a = b;
        this.b = da1Var;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        float f3;
        byte b = this.a;
        da1 da1Var = this.b;
        switch (b) {
            case 0:
                da1Var.F = f / 500.0f;
                da1Var.fragmentView.invalidate();
                return;
            default:
                if (da1Var.O) {
                    f3 = f / 500.0f;
                } else {
                    f3 = 1.0f - (f / 500.0f);
                }
                da1Var.c0 = f3;
                da1Var.fragmentView.invalidate();
                return;
        }
    }
}
