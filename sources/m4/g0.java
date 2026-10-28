package m4;
public final class g0 implements Runnable {
    public final int f18064a;
    public final p0 f18065b;

    public g0(p0 p0Var, int i10) {
        this.f18064a = i10;
        this.f18065b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f18064a) {
            case 0:
                p0 p0Var = this.f18065b;
                e2.n0.W(p0Var.f18180g.f18048l, new g0(p0Var, 1));
                return;
            default:
                this.f18065b.N();
                return;
        }
    }
}
