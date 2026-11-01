package m4;
public final class g0 implements Runnable {
    public final int f12763a;
    public final p0 f12764b;

    public g0(p0 p0Var, int i10) {
        this.f12763a = i10;
        this.f12764b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f12763a) {
            case 0:
                p0 p0Var = this.f12764b;
                e2.l0.W(p0Var.h.f12747l, new g0(p0Var, 1));
                return;
            default:
                this.f12764b.o0();
                return;
        }
    }
}
