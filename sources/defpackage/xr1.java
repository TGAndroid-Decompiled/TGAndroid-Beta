package defpackage;
public final class xr1 extends wb2 {
    public Runnable W;
    public final yv1 X;

    public xr1(yv1 yv1Var, yv1 yv1Var2, vr1 vr1Var, ylb ylbVar) {
        super(yv1Var2, vr1Var, ylbVar);
        this.X = yv1Var;
    }

    @Override
    public final void F() {
        yv1 yv1Var = this.X;
        if (yv1Var.ea == -1) {
            yv1Var.ea = yv1Var.getNotificationCenter().p(yv1.Dd, yv1Var.ea, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
            this.W = null;
        }
        wr1 wr1Var = new wr1(this, (byte) 1);
        this.W = wr1Var;
        gm.c3(wr1Var);
    }

    @Override
    public final void V() {
        yv1 yv1Var = this.X;
        yv1Var.ea = yv1Var.getNotificationCenter().p(yv1.Dd, yv1Var.ea, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
            this.W = null;
        }
        if (e21.a) {
            fc4.b("chatItemAnimator disable notifications");
        }
        o1 o1Var = yv1Var.a0.getAdjustPanLayoutHelper().h;
        gm.r(o1Var);
        o1Var.run();
        dy1 dy1Var = yv1Var.a0.N4;
        gm.r(dy1Var);
        dy1Var.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
        }
        wr1 wr1Var = new wr1(this, (byte) 0);
        this.W = wr1Var;
        gm.c3(wr1Var);
    }
}
