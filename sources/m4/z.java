package m4;
public final class z implements Runnable {
    public final int f13000a;
    public final f0 f13001b;

    public z(f0 f0Var, int i10) {
        this.f13000a = i10;
        this.f13001b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f13000a) {
            case 0:
                f0 f0Var = this.f13001b;
                d0 d0Var = f0Var.f12755u;
                if (d0Var != null) {
                    f0Var.f12754t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f13001b.getClass();
                return;
            case 2:
                f0.a(this.f13001b);
                return;
            default:
                this.f13001b.t();
                return;
        }
    }
}
