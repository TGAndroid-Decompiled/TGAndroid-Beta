package o4;
public final class x implements Runnable {
    public final int f16430a;
    public final b4.e0 f16431b;
    public final Object f16432c;
    public final j d;
    public final r e;

    public x(b4.e0 e0Var, z zVar, j jVar, r rVar, int i10) {
        this.f16430a = i10;
        this.f16431b = e0Var;
        this.f16432c = zVar;
        this.d = jVar;
        this.e = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16430a) {
            case 0:
                b4.e0 e0Var = this.f16431b;
                this.f16432c.a(e0Var.f1367b, (v) e0Var.f1368c, this.d, this.e);
                return;
            case 1:
                b4.e0 e0Var2 = this.f16431b;
                this.f16432c.d(e0Var2.f1367b, (v) e0Var2.f1368c, this.d, this.e);
                return;
            default:
                b4.e0 e0Var3 = this.f16431b;
                this.f16432c.h(e0Var3.f1367b, (v) e0Var3.f1368c, this.d, this.e);
                return;
        }
    }
}
