package dg;
public final class z0 implements Runnable {
    public final int f4739a;
    public final c1 f4740b;
    public final b4.e0 f4741c;

    public z0(c1 c1Var, b4.e0 e0Var, int i10) {
        this.f4739a = i10;
        this.f4740b = c1Var;
        this.f4741c = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f4739a) {
            case 0:
                this.f4740b.p(this.f4741c, true);
                return;
            default:
                c1 c1Var = this.f4740b;
                c1Var.f4455f.f(new z0(c1Var, this.f4741c, 0));
                return;
        }
    }
}
