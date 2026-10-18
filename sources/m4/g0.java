package m4;
public final class g0 implements Runnable {
    public final int f16541a;
    public final p0 f16542b;

    public g0(p0 p0Var, int i10) {
        this.f16541a = i10;
        this.f16542b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f16541a) {
            case 0:
                p0 p0Var = this.f16542b;
                e2.m0.W(p0Var.f16662g.f16527l, new g0(p0Var, 1));
                return;
            default:
                this.f16542b.N();
                return;
        }
    }
}
