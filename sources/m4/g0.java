package m4;
public final class g0 implements Runnable {
    public final int f16603a;
    public final p0 f16604b;

    public g0(p0 p0Var, int i10) {
        this.f16603a = i10;
        this.f16604b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f16603a) {
            case 0:
                p0 p0Var = this.f16604b;
                e2.m0.W(p0Var.f16724g.f16589l, new g0(p0Var, 1));
                return;
            default:
                this.f16604b.N();
                return;
        }
    }
}
