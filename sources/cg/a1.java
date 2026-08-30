package cg;
public final class a1 implements Runnable {
    public final int f2307a;
    public final d1 f2308b;
    public final b4.e0 f2309c;

    public a1(d1 d1Var, b4.e0 e0Var, int i10) {
        this.f2307a = i10;
        this.f2308b = d1Var;
        this.f2309c = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f2307a) {
            case 0:
                this.f2308b.p(this.f2309c, true);
                return;
            default:
                d1 d1Var = this.f2308b;
                d1Var.f2337f.f(new a1(d1Var, this.f2309c, 0));
                return;
        }
    }
}
