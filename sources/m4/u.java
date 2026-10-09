package m4;
public final class u implements Runnable {
    public final int f16236a;
    public final b0 f16237b;

    public u(b0 b0Var, int i10) {
        this.f16236a = i10;
        this.f16237b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f16236a) {
            case 0:
                b0 b0Var = this.f16237b;
                z zVar = b0Var.f15998u;
                if (zVar != null) {
                    b0Var.f15997t.D(zVar);
                    return;
                }
                return;
            case 1:
                this.f16237b.getClass();
                return;
            case 2:
                b0.a(this.f16237b);
                return;
            default:
                this.f16237b.t();
                return;
        }
    }
}
