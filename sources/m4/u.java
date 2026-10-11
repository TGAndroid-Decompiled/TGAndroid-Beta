package m4;
public final class u implements Runnable {
    public final int f16261a;
    public final b0 f16262b;

    public u(b0 b0Var, int i10) {
        this.f16261a = i10;
        this.f16262b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f16261a) {
            case 0:
                b0 b0Var = this.f16262b;
                z zVar = b0Var.f16023u;
                if (zVar != null) {
                    b0Var.f16022t.D(zVar);
                    return;
                }
                return;
            case 1:
                this.f16262b.getClass();
                return;
            case 2:
                b0.a(this.f16262b);
                return;
            default:
                this.f16262b.t();
                return;
        }
    }
}
