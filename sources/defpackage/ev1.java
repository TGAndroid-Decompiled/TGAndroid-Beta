package defpackage;
public final class ev1 extends k11 {
    public final rc2 d;
    public final iv1 e;

    public ev1(iv1 iv1Var, rc2 rc2Var) {
        this.e = iv1Var;
        this.d = rc2Var;
    }

    @Override
    public final void c(boolean z) {
        if (!z) {
            gm.d3(new pp1(this.e.a, (byte) 15), 250L);
        }
    }

    @Override
    public final void d() {
        yv1 yv1Var = this.e.a;
        rc2 rc2Var = this.d;
        yv1Var.kc = rc2Var.getMessageObject().e1();
        yv1Var.lc = 2;
        yv1Var.mc = null;
        rc2Var.invalidate();
    }
}
