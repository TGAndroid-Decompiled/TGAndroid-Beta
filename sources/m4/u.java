package m4;
public final class u implements Runnable {
    public final int f14950a;
    public final a0 f14951b;

    public u(a0 a0Var, int i10) {
        this.f14950a = i10;
        this.f14951b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14950a) {
            case 0:
                a0 a0Var = this.f14951b;
                y yVar = a0Var.f14724u;
                if (yVar != null) {
                    a0Var.f14723t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14951b.getClass();
                return;
            case 2:
                a0.a(this.f14951b);
                return;
            default:
                this.f14951b.t();
                return;
        }
    }
}
