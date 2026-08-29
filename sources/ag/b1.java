package ag;
public final class b1 implements Runnable {
    public final int f417a;
    public final f1 f418b;

    public b1(f1 f1Var, int i10) {
        this.f417a = i10;
        this.f418b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f417a) {
            case 0:
                f1 f1Var = this.f418b;
                f1Var.f471c = null;
                o1 o1Var = f1Var.f469a;
                if (o1Var != null) {
                    o1Var.c();
                    return;
                }
                return;
            default:
                this.f418b.b();
                return;
        }
    }
}
