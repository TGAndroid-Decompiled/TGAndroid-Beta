package og;
public final class s0 implements Runnable {
    public final int f14474a;
    public final v0 f14475b;
    public final a5.a f14476c;

    public s0(v0 v0Var, a5.a aVar, int i10) {
        this.f14474a = i10;
        this.f14475b = v0Var;
        this.f14476c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f14474a) {
            case 0:
                this.f14475b.p(this.f14476c, true);
                return;
            default:
                v0 v0Var = this.f14475b;
                v0Var.f14515f.f(new s0(v0Var, this.f14476c, 0));
                return;
        }
    }
}
