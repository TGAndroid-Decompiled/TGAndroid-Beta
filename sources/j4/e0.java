package j4;

public final class e0 implements Runnable {

    public final int f12541a;

    public final g0 f12542b;

    public final Object f12543c;
    public final p d;

    public final x f12544e;

    public e0(g0 g0Var, h0 h0Var, p pVar, x xVar, int i10) {
        this.f12541a = i10;
        this.f12542b = g0Var;
        this.f12543c = h0Var;
        this.d = pVar;
        this.f12544e = xVar;
    }

    @Override
    public final void run() {
        switch (this.f12541a) {
            case 0:
                g0 g0Var = this.f12542b;
                this.f12543c.h(g0Var.f12561a, g0Var.f12562b, this.d, this.f12544e);
                break;
            case 1:
                g0 g0Var2 = this.f12542b;
                this.f12543c.f(g0Var2.f12561a, g0Var2.f12562b, this.d, this.f12544e);
                break;
            default:
                g0 g0Var3 = this.f12542b;
                this.f12543c.g(g0Var3.f12561a, g0Var3.f12562b, this.d, this.f12544e);
                break;
        }
    }
}
