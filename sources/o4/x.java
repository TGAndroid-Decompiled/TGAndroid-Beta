package o4;
public final class x implements Runnable {
    public final int f16586a;
    public final b4.e0 f16587b;
    public final Object f16588c;
    public final j d;
    public final r f16589e;

    public x(b4.e0 e0Var, z zVar, j jVar, r rVar, int i10) {
        this.f16586a = i10;
        this.f16587b = e0Var;
        this.f16588c = zVar;
        this.d = jVar;
        this.f16589e = rVar;
    }

    @Override
    public final void run() {
        switch (this.f16586a) {
            case 0:
                b4.e0 e0Var = this.f16587b;
                this.f16588c.a(e0Var.f1474b, (v) e0Var.f1475c, this.d, this.f16589e);
                return;
            case 1:
                b4.e0 e0Var2 = this.f16587b;
                this.f16588c.d(e0Var2.f1474b, (v) e0Var2.f1475c, this.d, this.f16589e);
                return;
            default:
                b4.e0 e0Var3 = this.f16587b;
                this.f16588c.h(e0Var3.f1474b, (v) e0Var3.f1475c, this.d, this.f16589e);
                return;
        }
    }
}
