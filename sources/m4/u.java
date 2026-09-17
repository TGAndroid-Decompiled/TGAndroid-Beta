package m4;
public final class u implements Runnable {
    public final int f16091a;
    public final a0 f16092b;

    public u(a0 a0Var, int i10) {
        this.f16091a = i10;
        this.f16092b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f16091a) {
            case 0:
                a0 a0Var = this.f16092b;
                y yVar = a0Var.f15844u;
                if (yVar != null) {
                    a0Var.f15843t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f16092b.getClass();
                return;
            case 2:
                a0.a(this.f16092b);
                return;
            default:
                this.f16092b.t();
                return;
        }
    }
}
