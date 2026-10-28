package m4;
public final class z implements Runnable {
    public final int f18303a;
    public final f0 f18304b;

    public z(f0 f0Var, int i10) {
        this.f18303a = i10;
        this.f18304b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f18303a) {
            case 0:
                f0 f0Var = this.f18304b;
                d0 d0Var = f0Var.f18057u;
                if (d0Var != null) {
                    f0Var.f18056t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f18304b.getClass();
                return;
            case 2:
                f0.a(this.f18304b);
                return;
            default:
                this.f18304b.t();
                return;
        }
    }
}
