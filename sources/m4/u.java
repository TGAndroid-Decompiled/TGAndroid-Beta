package m4;
public final class u implements Runnable {
    public final int f16240a;
    public final b0 f16241b;

    public u(b0 b0Var, int i10) {
        this.f16240a = i10;
        this.f16241b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f16240a) {
            case 0:
                b0 b0Var = this.f16241b;
                z zVar = b0Var.f16002u;
                if (zVar != null) {
                    b0Var.f16001t.D(zVar);
                    return;
                }
                return;
            case 1:
                this.f16241b.getClass();
                return;
            case 2:
                b0.a(this.f16241b);
                return;
            default:
                this.f16241b.t();
                return;
        }
    }
}
