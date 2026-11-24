package defpackage;
public final class h67 extends wb2 {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
            this.W = null;
        }
        g67 g67Var = new g67(this, (byte) 0);
        this.W = g67Var;
        gm.c3(g67Var);
    }

    @Override
    public final void V() {
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
            this.W = null;
        }
        if (e21.a) {
            fc4.b("chatItemAnimator disable notifications");
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            gm.r(runnable);
        }
        g67 g67Var = new g67(this, (byte) 1);
        this.W = g67Var;
        gm.c3(g67Var);
    }

    @Override
    public final void F() {
    }
}
