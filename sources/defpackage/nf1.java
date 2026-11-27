package defpackage;
public final class nf1 extends bb2 {
    public int W;
    public fv0 X;
    public final wf1 Y;

    public nf1(wf1 wf1Var, d79 d79Var, vnb vnbVar) {
        super(null, d79Var, vnbVar);
        this.Y = wf1Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        fv0 fv0Var = this.X;
        if (fv0Var != null) {
            hl.r(fv0Var);
        }
        fv0 fv0Var2 = new fv0(this, (byte) 24);
        this.X = fv0Var2;
        hl.c3(fv0Var2);
    }

    @Override
    public final void V() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().p(wf1.R0, this.W, false);
        }
        fv0 fv0Var = this.X;
        if (fv0Var != null) {
            hl.r(fv0Var);
            this.X = null;
        }
        if (f11.a) {
            cc4.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
