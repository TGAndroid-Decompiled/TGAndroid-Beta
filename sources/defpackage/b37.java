package defpackage;
public final class b37 extends la2 {
    public int W;
    public Runnable X;
    public final f37 Y;

    public b37(f37 f37Var, fu fuVar, wjb wjbVar) {
        super(null, fuVar, wjbVar);
        this.Y = f37Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            gl.r(runnable);
        }
        a37 a37Var = new a37(this, (byte) 0);
        this.X = a37Var;
        gl.c3(a37Var);
        f37 f37Var = this.Y;
        if (f37Var.W) {
            f37Var.W = false;
            gl.c3(new a37(this, (byte) 1));
        }
    }

    @Override
    public final void V() {
        l37 l37Var = this.Y.d0;
        gl.r(l37Var.E);
        l37Var.E.run();
        if (this.W == -1) {
            this.W = kk7.f(l37Var.x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            gl.r(runnable);
            this.X = null;
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            gl.r(runnable);
        }
        a37 a37Var = new a37(this, (byte) 2);
        this.X = a37Var;
        gl.c3(a37Var);
    }
}
