package defpackage;
public final class ss1 extends cw6 {
    public final yv1 x;

    public ss1(yv1 yv1Var, vr1 vr1Var, yr1 yr1Var) {
        super(vr1Var, yr1Var);
        this.x = yv1Var;
    }

    public final void m(int i) {
        if (this.x.nb) {
            if (i == 0) {
                i = 1;
            } else if (i == 1) {
                i = 0;
            }
        }
        this.b = i;
    }
}
