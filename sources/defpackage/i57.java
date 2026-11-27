package defpackage;
public final class i57 extends bb2 {
    public int W;
    public Runnable X;
    public final m57 Y;

    public i57(m57 m57Var, gu guVar, vnb vnbVar) {
        super(null, guVar, vnbVar);
        this.Y = m57Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            hl.r(runnable);
        }
        h57 h57Var = new h57(this, (byte) 0);
        this.X = h57Var;
        hl.c3(h57Var);
        m57 m57Var = this.Y;
        if (m57Var.W) {
            m57Var.W = false;
            hl.c3(new h57(this, (byte) 1));
        }
    }

    @Override
    public final void V() {
        s57 s57Var = this.Y.d0;
        hl.r(s57Var.E);
        s57Var.E.run();
        if (this.W == -1) {
            this.W = jn7.f(s57Var.x).p(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            hl.r(runnable);
            this.X = null;
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            hl.r(runnable);
        }
        h57 h57Var = new h57(this, (byte) 2);
        this.X = h57Var;
        hl.c3(h57Var);
    }
}
