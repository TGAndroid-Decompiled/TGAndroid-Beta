package o4;
public final class x implements Runnable {
    public final int f16412a;
    public final b4.e0 f16413b;
    public final Object f16414c;
    public final j d;
    public final r e;

    public x(b4.e0 e0Var, z zVar, j jVar, r rVar, int i10) {
        this.f16412a = i10;
        this.f16413b = e0Var;
        this.f16414c = zVar;
        this.d = jVar;
        this.e = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16412a) {
            case 0:
                b4.e0 e0Var = this.f16413b;
                this.f16414c.a(e0Var.f1378b, (v) e0Var.f1379c, this.d, this.e);
                return;
            case 1:
                b4.e0 e0Var2 = this.f16413b;
                this.f16414c.d(e0Var2.f1378b, (v) e0Var2.f1379c, this.d, this.e);
                return;
            default:
                b4.e0 e0Var3 = this.f16413b;
                this.f16414c.h(e0Var3.f1378b, (v) e0Var3.f1379c, this.d, this.e);
                return;
        }
    }
}
