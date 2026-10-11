package m4;
public final class u implements Runnable {
    public final int f16297a;
    public final b0 f16298b;

    public u(b0 b0Var, int i10) {
        this.f16297a = i10;
        this.f16298b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f16297a) {
            case 0:
                b0 b0Var = this.f16298b;
                z zVar = b0Var.f16059u;
                if (zVar != null) {
                    b0Var.f16058t.D(zVar);
                    return;
                }
                return;
            case 1:
                this.f16298b.getClass();
                return;
            case 2:
                b0.a(this.f16298b);
                return;
            default:
                this.f16298b.t();
                return;
        }
    }
}
