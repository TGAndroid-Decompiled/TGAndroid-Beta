package ig;
public final class n0 implements Runnable {
    public final int f8369a;
    public final q0 f8370b;
    public final a5.a f8371c;

    public n0(q0 q0Var, a5.a aVar, int i10) {
        this.f8369a = i10;
        this.f8370b = q0Var;
        this.f8371c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f8369a) {
            case 0:
                this.f8370b.p(this.f8371c, true);
                return;
            default:
                q0 q0Var = this.f8370b;
                q0Var.f8414f.f(new n0(q0Var, this.f8371c, 0));
                return;
        }
    }
}
