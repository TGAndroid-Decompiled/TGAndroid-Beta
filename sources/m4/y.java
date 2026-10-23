package m4;
public final class y implements Runnable {
    public final int f16836a;
    public final f0 f16837b;

    public y(f0 f0Var, int i10) {
        this.f16836a = i10;
        this.f16837b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f16836a) {
            case 0:
                f0 f0Var = this.f16837b;
                d0 d0Var = f0Var.f16598u;
                if (d0Var != null) {
                    f0Var.f16597t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f16837b.getClass();
                return;
            case 2:
                f0.a(this.f16837b);
                return;
            default:
                this.f16837b.t();
                return;
        }
    }
}
