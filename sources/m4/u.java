package m4;
public final class u implements Runnable {
    public final int f14919a;
    public final a0 f14920b;

    public u(a0 a0Var, int i10) {
        this.f14919a = i10;
        this.f14920b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14919a) {
            case 0:
                a0 a0Var = this.f14920b;
                y yVar = a0Var.f14693u;
                if (yVar != null) {
                    a0Var.f14692t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14920b.getClass();
                return;
            case 2:
                a0.a(this.f14920b);
                return;
            default:
                this.f14920b.t();
                return;
        }
    }
}
