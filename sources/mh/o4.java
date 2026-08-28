package mh;
public final class o4 implements Runnable {
    public final int f18022a;
    public final p4 f18023b;

    public o4(p4 p4Var, int i9) {
        this.f18022a = i9;
        this.f18023b = p4Var;
    }

    @Override
    public final void run() {
        switch (this.f18022a) {
            case 0:
                p4 p4Var = this.f18023b;
                if (p4Var.f18044w) {
                    p4Var.d();
                    return;
                }
                return;
            default:
                this.f18023b.invalidateSelf();
                return;
        }
    }
}
