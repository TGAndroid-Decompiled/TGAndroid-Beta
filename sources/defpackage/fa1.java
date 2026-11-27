package defpackage;
public final class fa1 implements qs3 {
    public final byte a;
    public final la1 b;

    public fa1(la1 la1Var, byte b) {
        this.a = b;
        this.b = la1Var;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        float f3;
        byte b = this.a;
        la1 la1Var = this.b;
        switch (b) {
            case 0:
                if (la1Var.O) {
                    f3 = f / 500.0f;
                } else {
                    f3 = 1.0f - (f / 500.0f);
                }
                la1Var.c0 = f3;
                la1Var.fragmentView.invalidate();
                return;
            default:
                la1Var.F = f / 500.0f;
                la1Var.fragmentView.invalidate();
                return;
        }
    }
}
