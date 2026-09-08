package m4;
public final class u implements Runnable {
    public final int f16118a;
    public final a0 f16119b;

    public u(a0 a0Var, int i10) {
        this.f16118a = i10;
        this.f16119b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f16118a) {
            case 0:
                a0 a0Var = this.f16119b;
                y yVar = a0Var.f15871u;
                if (yVar != null) {
                    a0Var.f15870t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f16119b.getClass();
                return;
            case 2:
                a0.a(this.f16119b);
                return;
            default:
                this.f16119b.t();
                return;
        }
    }
}
