package defpackage;
public final class md8 implements Runnable {
    public final byte a;
    public final qd8 b;

    public md8(qd8 qd8Var, byte b) {
        this.a = b;
        this.b = qd8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qd8 qd8Var = this.b;
        switch (b) {
            case 0:
                qd8Var.d();
                return;
            default:
                qd8Var.f();
                return;
        }
    }
}
