package ig;
public final class m0 implements Runnable {
    public final int f8363a;
    public final q0 f8364b;

    public m0(q0 q0Var, int i10) {
        this.f8363a = i10;
        this.f8364b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f8363a) {
            case 0:
                q0 q0Var = this.f8364b;
                q0Var.f8413c = null;
                a4.l lVar = q0Var.f8411a;
                if (lVar != null) {
                    lVar.u();
                    return;
                }
                return;
            default:
                this.f8364b.b();
                return;
        }
    }
}
