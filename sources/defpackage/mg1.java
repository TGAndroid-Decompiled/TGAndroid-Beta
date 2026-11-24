package defpackage;
public final class mg1 extends wb2 {
    public int W;
    public yt0 X;
    public final vg1 Y;

    public mg1(vg1 vg1Var, r59 r59Var, ylb ylbVar) {
        super(null, r59Var, ylbVar);
        this.Y = vg1Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            gm.r(yt0Var);
        }
        yt0 yt0Var2 = new yt0(this, (byte) 24);
        this.X = yt0Var2;
        gm.c3(yt0Var2);
    }

    @Override
    public final void V() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().p(vg1.R0, this.W, false);
        }
        yt0 yt0Var = this.X;
        if (yt0Var != null) {
            gm.r(yt0Var);
            this.X = null;
        }
        if (e21.a) {
            fc4.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
