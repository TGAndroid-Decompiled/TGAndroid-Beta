package m4;
public final class y implements Runnable {
    public final int f16769a;
    public final f0 f16770b;

    public y(f0 f0Var, int i10) {
        this.f16769a = i10;
        this.f16770b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f16769a) {
            case 0:
                f0 f0Var = this.f16770b;
                d0 d0Var = f0Var.f16529u;
                if (d0Var != null) {
                    f0Var.f16528t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f16770b.getClass();
                return;
            case 2:
                f0.a(this.f16770b);
                return;
            default:
                this.f16770b.t();
                return;
        }
    }
}
