package m4;
public final class u implements Runnable {
    public final int f16301a;
    public final a0 f16302b;

    public u(a0 a0Var, int i10) {
        this.f16301a = i10;
        this.f16302b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f16301a) {
            case 0:
                a0 a0Var = this.f16302b;
                y yVar = a0Var.f16058u;
                if (yVar != null) {
                    a0Var.f16057t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f16302b.getClass();
                return;
            case 2:
                a0.a(this.f16302b);
                return;
            default:
                this.f16302b.t();
                return;
        }
    }
}
