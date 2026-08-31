package o4;
public final class a0 implements Runnable {
    public final int f16434a;
    public final e0 f16435b;

    public a0(e0 e0Var, int i10) {
        this.f16434a = i10;
        this.f16435b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f16434a) {
            case 0:
                this.f16435b.v();
                return;
            case 1:
                e0 e0Var = this.f16435b;
                if (!e0Var.Y) {
                    s sVar = e0Var.D;
                    sVar.getClass();
                    sVar.s(e0Var);
                    return;
                }
                return;
            default:
                this.f16435b.S = true;
                return;
        }
    }
}
