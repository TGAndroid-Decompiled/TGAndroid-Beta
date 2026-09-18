package m4;
public final class u implements Runnable {
    public final int f14883a;
    public final a0 f14884b;

    public u(a0 a0Var, int i10) {
        this.f14883a = i10;
        this.f14884b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14883a) {
            case 0:
                a0 a0Var = this.f14884b;
                y yVar = a0Var.f14652u;
                if (yVar != null) {
                    a0Var.f14651t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14884b.getClass();
                return;
            case 2:
                a0.a(this.f14884b);
                return;
            default:
                this.f14884b.t();
                return;
        }
    }
}
