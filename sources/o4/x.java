package o4;
public final class x implements Runnable {
    public final int f16588a;
    public final b4.e0 f16589b;
    public final Object f16590c;
    public final j d;
    public final r f16591e;

    public x(b4.e0 e0Var, z zVar, j jVar, r rVar, int i10) {
        this.f16588a = i10;
        this.f16589b = e0Var;
        this.f16590c = zVar;
        this.d = jVar;
        this.f16591e = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16588a) {
            case 0:
                b4.e0 e0Var = this.f16589b;
                this.f16590c.a(e0Var.f1474b, (v) e0Var.f1475c, this.d, this.f16591e);
                return;
            case 1:
                b4.e0 e0Var2 = this.f16589b;
                this.f16590c.d(e0Var2.f1474b, (v) e0Var2.f1475c, this.d, this.f16591e);
                return;
            default:
                b4.e0 e0Var3 = this.f16589b;
                this.f16590c.h(e0Var3.f1474b, (v) e0Var3.f1475c, this.d, this.f16591e);
                return;
        }
    }
}
