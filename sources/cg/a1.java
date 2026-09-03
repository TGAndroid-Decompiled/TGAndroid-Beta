package cg;
public final class a1 implements Runnable {
    public final int f2290a;
    public final d1 f2291b;
    public final b4.e0 f2292c;

    public a1(d1 d1Var, b4.e0 e0Var, int i10) {
        this.f2290a = i10;
        this.f2291b = d1Var;
        this.f2292c = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f2290a) {
            case 0:
                this.f2291b.p(this.f2292c, true);
                return;
            default:
                d1 d1Var = this.f2291b;
                d1Var.f2320f.f(new a1(d1Var, this.f2292c, 0));
                return;
        }
    }
}
