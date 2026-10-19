package m4;
public final class g0 implements Runnable {
    public final int f16542a;
    public final p0 f16543b;

    public g0(p0 p0Var, int i10) {
        this.f16542a = i10;
        this.f16543b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f16542a) {
            case 0:
                p0 p0Var = this.f16543b;
                e2.m0.W(p0Var.f16663g.f16528l, new g0(p0Var, 1));
                return;
            default:
                this.f16543b.N();
                return;
        }
    }
}
