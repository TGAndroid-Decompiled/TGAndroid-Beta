package m4;
public final class g0 implements Runnable {
    public final int f16539a;
    public final p0 f16540b;

    public g0(p0 p0Var, int i10) {
        this.f16539a = i10;
        this.f16540b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f16539a) {
            case 0:
                p0 p0Var = this.f16540b;
                e2.m0.W(p0Var.f16660g.f16525l, new g0(p0Var, 1));
                return;
            default:
                this.f16540b.N();
                return;
        }
    }
}
