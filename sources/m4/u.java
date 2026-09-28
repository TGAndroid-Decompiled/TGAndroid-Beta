package m4;
public final class u implements Runnable {
    public final int f14934a;
    public final a0 f14935b;

    public u(a0 a0Var, int i10) {
        this.f14934a = i10;
        this.f14935b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f14934a) {
            case 0:
                a0 a0Var = this.f14935b;
                y yVar = a0Var.f14708u;
                if (yVar != null) {
                    a0Var.f14707t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f14935b.getClass();
                return;
            case 2:
                a0.a(this.f14935b);
                return;
            default:
                this.f14935b.t();
                return;
        }
    }
}
