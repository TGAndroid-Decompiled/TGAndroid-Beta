package m4;
public final class g0 implements Runnable {
    public final int f16534a;
    public final p0 f16535b;

    public g0(p0 p0Var, int i10) {
        this.f16534a = i10;
        this.f16535b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f16534a) {
            case 0:
                p0 p0Var = this.f16535b;
                e2.m0.W(p0Var.f16655g.f16520l, new g0(p0Var, 1));
                return;
            default:
                this.f16535b.N();
                return;
        }
    }
}
