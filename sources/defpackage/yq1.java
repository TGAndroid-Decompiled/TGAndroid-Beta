package defpackage;
public final class yq1 extends bb2 {
    public Runnable W;
    public final zu1 X;

    public yq1(zu1 zu1Var, zu1 zu1Var2, wq1 wq1Var, vnb vnbVar) {
        super(zu1Var2, wq1Var, vnbVar);
        this.X = zu1Var;
    }

    @Override
    public final void F() {
        zu1 zu1Var = this.X;
        if (zu1Var.ea == -1) {
            zu1Var.ea = zu1Var.getNotificationCenter().p(zu1.Gd, zu1Var.ea, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
            this.W = null;
        }
        xq1 xq1Var = new xq1(this, (byte) 1);
        this.W = xq1Var;
        hl.c3(xq1Var);
    }

    @Override
    public final void V() {
        zu1 zu1Var = this.X;
        zu1Var.ea = zu1Var.getNotificationCenter().p(zu1.Gd, zu1Var.ea, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
            this.W = null;
        }
        if (f11.a) {
            cc4.b("chatItemAnimator disable notifications");
        }
        p1 p1Var = zu1Var.a0.getAdjustPanLayoutHelper().h;
        hl.r(p1Var);
        p1Var.run();
        dx1 dx1Var = zu1Var.a0.M4;
        hl.r(dx1Var);
        dx1Var.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
        }
        xq1 xq1Var = new xq1(this, (byte) 0);
        this.W = xq1Var;
        hl.c3(xq1Var);
    }
}
