package ig;
public final class n0 implements Runnable {
    public final int f8368a;
    public final q0 f8369b;
    public final a5.a f8370c;

    public n0(q0 q0Var, a5.a aVar, int i10) {
        this.f8368a = i10;
        this.f8369b = q0Var;
        this.f8370c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f8368a) {
            case 0:
                this.f8369b.p(this.f8370c, true);
                return;
            default:
                q0 q0Var = this.f8369b;
                q0Var.f8413f.f(new n0(q0Var, this.f8370c, 0));
                return;
        }
    }
}
