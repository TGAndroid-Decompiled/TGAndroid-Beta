package m4;
public final class y implements Runnable {
    public final int f16772a;
    public final f0 f16773b;

    public y(f0 f0Var, int i10) {
        this.f16772a = i10;
        this.f16773b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f16772a) {
            case 0:
                f0 f0Var = this.f16773b;
                d0 d0Var = f0Var.f16534u;
                if (d0Var != null) {
                    f0Var.f16533t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f16773b.getClass();
                return;
            case 2:
                f0.a(this.f16773b);
                return;
            default:
                this.f16773b.t();
                return;
        }
    }
}
