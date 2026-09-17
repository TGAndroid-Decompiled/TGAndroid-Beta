package m4;
public final class u implements Runnable {
    public final int f14713a;
    public final a0 f14714b;

    public u(a0 a0Var, int i10) {
        this.f14713a = i10;
        this.f14714b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14713a) {
            case 0:
                a0 a0Var = this.f14714b;
                y yVar = a0Var.f14477u;
                if (yVar != null) {
                    a0Var.f14476t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14714b.getClass();
                return;
            case 2:
                a0.a(this.f14714b);
                return;
            default:
                this.f14714b.t();
                return;
        }
    }
}
