package m4;
public final class u implements Runnable {
    public final int f13537a;
    public final b0 f13538b;

    public u(b0 b0Var, int i10) {
        this.f13537a = i10;
        this.f13538b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f13537a) {
            case 0:
                b0 b0Var = this.f13538b;
                z zVar = b0Var.f13308u;
                if (zVar != null) {
                    b0Var.f13307t.D(zVar);
                    return;
                }
                return;
            case 1:
                this.f13538b.getClass();
                return;
            case 2:
                b0.a(this.f13538b);
                return;
            default:
                this.f13538b.t();
                return;
        }
    }
}
