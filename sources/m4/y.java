package m4;
public final class y implements Runnable {
    public final int f16773a;
    public final f0 f16774b;

    public y(f0 f0Var, int i10) {
        this.f16773a = i10;
        this.f16774b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f16773a) {
            case 0:
                f0 f0Var = this.f16774b;
                d0 d0Var = f0Var.f16535u;
                if (d0Var != null) {
                    f0Var.f16534t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f16774b.getClass();
                return;
            case 2:
                f0.a(this.f16774b);
                return;
            default:
                this.f16774b.t();
                return;
        }
    }
}
