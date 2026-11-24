package defpackage;
public final class b57 extends wb2 {
    public int W;
    public Runnable X;
    public final f57 Y;

    public b57(f57 f57Var, fv fvVar, ylb ylbVar) {
        super(null, fvVar, ylbVar);
        this.Y = f57Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            gm.r(runnable);
        }
        a57 a57Var = new a57(this, (byte) 0);
        this.X = a57Var;
        gm.c3(a57Var);
        f57 f57Var = this.Y;
        if (f57Var.W) {
            f57Var.W = false;
            gm.c3(new a57(this, (byte) 1));
        }
    }

    @Override
    public final void V() {
        l57 l57Var = this.Y.d0;
        gm.r(l57Var.E);
        l57Var.E.run();
        if (this.W == -1) {
            this.W = nm7.f(l57Var.x).p(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            gm.r(runnable);
            this.X = null;
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            gm.r(runnable);
        }
        a57 a57Var = new a57(this, (byte) 2);
        this.X = a57Var;
        gm.c3(a57Var);
    }
}
