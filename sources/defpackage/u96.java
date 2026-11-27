package defpackage;
public final class u96 implements Runnable {
    public final byte a;
    public final w96 b;

    public u96(w96 w96Var, byte b) {
        this.a = b;
        this.b = w96Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        w96 w96Var = this.b;
        switch (b) {
            case 0:
                w96Var.u();
                jn7.f(w96Var.e).k(177, Long.valueOf(w96Var.s.id));
                w96Var.E(true);
                return;
            case 1:
                w96Var.A();
                return;
            case 2:
                w96Var.B();
                return;
            case 3:
                jn7.f(w96Var.e).k(177, Long.valueOf(w96Var.j()));
                return;
            case 4:
            case 7:
                w96Var.G();
                return;
            case 5:
                w96Var.B();
                return;
            case 6:
                if (!w96Var.w) {
                    w96Var.x();
                    return;
                }
                return;
            case 8:
                w96Var.A();
                return;
            default:
                w96Var.f();
                return;
        }
    }
}
