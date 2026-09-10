package og;
public final class r0 implements Runnable {
    public final int f14467a;
    public final v0 f14468b;

    public r0(v0 v0Var, int i10) {
        this.f14467a = i10;
        this.f14468b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f14467a) {
            case 0:
                v0 v0Var = this.f14468b;
                v0Var.f14514c = null;
                l2.h hVar = v0Var.f14512a;
                if (hVar != null) {
                    hVar.n();
                    return;
                }
                return;
            default:
                this.f14468b.b();
                return;
        }
    }
}
