package o4;
public final class a0 implements Runnable {
    public final int f16274a;
    public final e0 f16275b;

    public a0(e0 e0Var, int i10) {
        this.f16274a = i10;
        this.f16275b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f16274a) {
            case 0:
                this.f16275b.h();
                return;
            case 1:
                e0 e0Var = this.f16275b;
                if (!e0Var.Y) {
                    s sVar = e0Var.D;
                    sVar.getClass();
                    sVar.X1(e0Var);
                    return;
                }
                return;
            default:
                this.f16275b.S = true;
                return;
        }
    }
}
