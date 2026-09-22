package m4;
public final class u implements Runnable {
    public final int f14701a;
    public final a0 f14702b;

    public u(a0 a0Var, int i10) {
        this.f14701a = i10;
        this.f14702b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14701a) {
            case 0:
                a0 a0Var = this.f14702b;
                y yVar = a0Var.f14465u;
                if (yVar != null) {
                    a0Var.f14464t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14702b.getClass();
                return;
            case 2:
                a0.a(this.f14702b);
                return;
            default:
                this.f14702b.t();
                return;
        }
    }
}
