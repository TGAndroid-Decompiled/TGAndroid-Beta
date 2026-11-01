package m4;
public final class z implements Runnable {
    public final int f13001a;
    public final f0 f13002b;

    public z(f0 f0Var, int i10) {
        this.f13001a = i10;
        this.f13002b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f13001a) {
            case 0:
                f0 f0Var = this.f13002b;
                d0 d0Var = f0Var.f12756u;
                if (d0Var != null) {
                    f0Var.f12755t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f13002b.getClass();
                return;
            case 2:
                f0.a(this.f13002b);
                return;
            default:
                this.f13002b.t();
                return;
        }
    }
}
