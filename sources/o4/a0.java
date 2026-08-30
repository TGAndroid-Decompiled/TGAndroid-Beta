package o4;
public final class a0 implements Runnable {
    public final int f16292a;
    public final e0 f16293b;

    public a0(e0 e0Var, int i10) {
        this.f16292a = i10;
        this.f16293b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f16292a) {
            case 0:
                this.f16293b.i();
                return;
            case 1:
                e0 e0Var = this.f16293b;
                if (!e0Var.Y) {
                    s sVar = e0Var.D;
                    sVar.getClass();
                    sVar.Z(e0Var);
                    return;
                }
                return;
            default:
                this.f16293b.S = true;
                return;
        }
    }
}
