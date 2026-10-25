package m4;
public final class z implements Runnable {
    public final int f18304a;
    public final f0 f18305b;

    public z(f0 f0Var, int i10) {
        this.f18304a = i10;
        this.f18305b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f18304a) {
            case 0:
                f0 f0Var = this.f18305b;
                d0 d0Var = f0Var.f18058u;
                if (d0Var != null) {
                    f0Var.f18057t.C(d0Var);
                    return;
                }
                return;
            case 1:
                this.f18305b.getClass();
                return;
            case 2:
                f0.a(this.f18305b);
                return;
            default:
                this.f18305b.t();
                return;
        }
    }
}
