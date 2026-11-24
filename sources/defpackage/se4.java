package defpackage;
public final class se4 implements Runnable {
    public final byte a;
    public final qf4 b;

    public se4(qf4 qf4Var, byte b) {
        this.a = b;
        this.b = qf4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qf4 qf4Var = this.b;
        switch (b) {
            case 0:
                qf4Var.p0();
                return;
            default:
                qf4Var.o0();
                return;
        }
    }
}
