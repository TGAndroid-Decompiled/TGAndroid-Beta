package defpackage;
public final class st1 extends c01 {
    public final gb2 d;
    public final wt1 e;

    public st1(wt1 wt1Var, gb2 gb2Var) {
        this.e = wt1Var;
        this.d = gb2Var;
    }

    @Override
    public final void c(boolean z) {
        if (!z) {
            gl.e3(new ho1(this.e.a, (byte) 11), 250L);
        }
    }

    @Override
    public final void d() {
        mu1 mu1Var = this.e.a;
        gb2 gb2Var = this.d;
        mu1Var.ac = gb2Var.getMessageObject().e1();
        mu1Var.bc = 2;
        mu1Var.cc = null;
        gb2Var.invalidate();
    }
}
