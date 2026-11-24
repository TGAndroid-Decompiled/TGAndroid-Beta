package defpackage;
public final class kd2 implements Runnable {
    public final byte a;
    public final qd2 b;

    public kd2(qd2 qd2Var, byte b) {
        this.a = b;
        this.b = qd2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qd2 qd2Var = this.b;
        switch (b) {
            case 0:
                nm7.f(qd2Var.C.a).k(167, Long.valueOf(qd2Var.c), Long.valueOf(qd2Var.b.id), Boolean.FALSE);
                return;
            case 1:
                qd2Var.E = false;
                qd2Var.d();
                nm7.f(qd2Var.C.a).k(173, new Object[0]);
                return;
            case 2:
            default:
                qd2Var.e();
                return;
        }
    }
}
