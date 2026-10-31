package ig;
public final class m0 implements Runnable {
    public final int f8362a;
    public final q0 f8363b;

    public m0(q0 q0Var, int i10) {
        this.f8362a = i10;
        this.f8363b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f8362a) {
            case 0:
                q0 q0Var = this.f8363b;
                q0Var.f8412c = null;
                a4.l lVar = q0Var.f8410a;
                if (lVar != null) {
                    lVar.u();
                    return;
                }
                return;
            default:
                this.f8363b.b();
                return;
        }
    }
}
