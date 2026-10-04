package m4;
public final class u implements Runnable {
    public final int f16297a;
    public final a0 f16298b;

    public u(a0 a0Var, int i10) {
        this.f16297a = i10;
        this.f16298b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f16297a) {
            case 0:
                a0 a0Var = this.f16298b;
                y yVar = a0Var.f16054u;
                if (yVar != null) {
                    a0Var.f16053t.D(yVar);
                    return;
                }
                return;
            case 1:
                this.f16298b.getClass();
                return;
            case 2:
                a0.a(this.f16298b);
                return;
            default:
                this.f16298b.t();
                return;
        }
    }
}
