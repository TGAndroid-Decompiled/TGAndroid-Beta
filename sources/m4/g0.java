package m4;
public final class g0 implements Runnable {
    public final int f18065a;
    public final p0 f18066b;

    public g0(p0 p0Var, int i10) {
        this.f18065a = i10;
        this.f18066b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f18065a) {
            case 0:
                p0 p0Var = this.f18066b;
                e2.n0.W(p0Var.f18181g.f18049l, new g0(p0Var, 1));
                return;
            default:
                this.f18066b.N();
                return;
        }
    }
}
