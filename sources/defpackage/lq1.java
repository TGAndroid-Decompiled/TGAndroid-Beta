package defpackage;
public final class lq1 extends la2 {
    public Runnable W;
    public final mu1 X;

    public lq1(mu1 mu1Var, mu1 mu1Var2, jq1 jq1Var, wjb wjbVar) {
        super(mu1Var2, jq1Var, wjbVar);
        this.X = mu1Var;
    }

    @Override
    public final void F() {
        mu1 mu1Var = this.X;
        if (mu1Var.ea == -1) {
            mu1Var.ea = mu1Var.getNotificationCenter().q(mu1.td, mu1Var.ea, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        kq1 kq1Var = new kq1(this, (byte) 1);
        this.W = kq1Var;
        gl.c3(kq1Var);
    }

    @Override
    public final void V() {
        mu1 mu1Var = this.X;
        mu1Var.ea = mu1Var.getNotificationCenter().q(mu1.td, mu1Var.ea, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        if (w01.a) {
            fa4.b("chatItemAnimator disable notifications");
        }
        o1 o1Var = mu1Var.a0.getAdjustPanLayoutHelper().h;
        gl.r(o1Var);
        o1Var.run();
        qw1 qw1Var = mu1Var.a0.N4;
        gl.r(qw1Var);
        qw1Var.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
        }
        kq1 kq1Var = new kq1(this, (byte) 0);
        this.W = kq1Var;
        gl.c3(kq1Var);
    }
}
