package ag;
public final class c1 implements Runnable {
    public final int f425a;
    public final f1 f426b;
    public final j2 f427c;

    public c1(f1 f1Var, j2 j2Var, int i10) {
        this.f425a = i10;
        this.f426b = f1Var;
        this.f427c = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f425a) {
            case 0:
                this.f426b.p(this.f427c, true);
                return;
            default:
                f1 f1Var = this.f426b;
                f1Var.f473f.f(new c1(f1Var, this.f427c, 0));
                return;
        }
    }
}
