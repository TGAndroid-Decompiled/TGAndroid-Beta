package defpackage;
public final class sc4 implements Runnable {
    public final byte a;
    public final pd4 b;

    public sc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 0:
                pd4Var.o0();
                return;
            default:
                pd4Var.n0();
                return;
        }
    }
}
