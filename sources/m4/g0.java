package m4;
public final class g0 implements Runnable {
    public final int f16540a;
    public final p0 f16541b;

    public g0(p0 p0Var, int i10) {
        this.f16540a = i10;
        this.f16541b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f16540a) {
            case 0:
                p0 p0Var = this.f16541b;
                e2.m0.W(p0Var.f16661g.f16526l, new g0(p0Var, 1));
                return;
            default:
                this.f16541b.N();
                return;
        }
    }
}
