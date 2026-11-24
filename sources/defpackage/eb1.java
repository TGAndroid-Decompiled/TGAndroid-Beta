package defpackage;
public final class eb1 implements it3 {
    public final byte a;
    public final lb1 b;

    public eb1(lb1 lb1Var, byte b) {
        this.a = b;
        this.b = lb1Var;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        float f3;
        byte b = this.a;
        lb1 lb1Var = this.b;
        switch (b) {
            case 0:
                lb1Var.F = f / 500.0f;
                lb1Var.fragmentView.invalidate();
                return;
            default:
                if (lb1Var.O) {
                    f3 = f / 500.0f;
                } else {
                    f3 = 1.0f - (f / 500.0f);
                }
                lb1Var.c0 = f3;
                lb1Var.fragmentView.invalidate();
                return;
        }
    }
}
