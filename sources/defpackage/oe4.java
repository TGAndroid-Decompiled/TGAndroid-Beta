package defpackage;
public final class oe4 implements Runnable {
    public final byte a;
    public final nf4 b;

    public oe4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                nf4Var.o0();
                return;
            default:
                nf4Var.n0();
                return;
        }
    }
}
