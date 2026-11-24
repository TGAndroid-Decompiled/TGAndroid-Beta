package defpackage;
public final class q96 implements Runnable {
    public final byte a;
    public final s96 b;

    public q96(s96 s96Var, byte b) {
        this.a = b;
        this.b = s96Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s96 s96Var = this.b;
        switch (b) {
            case 0:
                s96Var.B();
                return;
            case 1:
                if (!s96Var.w) {
                    s96Var.x();
                    return;
                }
                return;
            case 2:
            case 5:
                s96Var.G();
                return;
            case 3:
                s96Var.A();
                return;
            case 4:
                s96Var.u();
                nm7.f(s96Var.e).k(177, Long.valueOf(s96Var.s.id));
                s96Var.E(true);
                return;
            case 6:
                s96Var.A();
                return;
            case 7:
                s96Var.B();
                return;
            case 8:
                nm7.f(s96Var.e).k(177, Long.valueOf(s96Var.j()));
                return;
            default:
                s96Var.f();
                return;
        }
    }
}
