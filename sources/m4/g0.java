package m4;
public final class g0 implements Runnable {
    public final int f12762a;
    public final p0 f12763b;

    public g0(p0 p0Var, int i10) {
        this.f12762a = i10;
        this.f12763b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f12762a) {
            case 0:
                p0 p0Var = this.f12763b;
                e2.l0.W(p0Var.h.f12746l, new g0(p0Var, 1));
                return;
            default:
                this.f12763b.o0();
                return;
        }
    }
}
