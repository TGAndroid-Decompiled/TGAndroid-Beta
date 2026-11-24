package defpackage;
public final class h47 extends la2 {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        g47 g47Var = new g47(this, (byte) 0);
        this.W = g47Var;
        gl.c3(g47Var);
    }

    @Override
    public final void V() {
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
            this.W = null;
        }
        if (w01.a) {
            fa4.b("chatItemAnimator disable notifications");
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            gl.r(runnable);
        }
        g47 g47Var = new g47(this, (byte) 1);
        this.W = g47Var;
        gl.c3(g47Var);
    }

    @Override
    public final void F() {
    }
}
