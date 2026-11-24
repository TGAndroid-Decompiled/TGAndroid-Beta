package defpackage;
public final class tr4 implements Runnable {
    public final byte a;
    public final wr4 b;

    public tr4(wr4 wr4Var, byte b) {
        this.a = b;
        this.b = wr4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wr4 wr4Var = this.b;
        switch (b) {
            case 0:
                wr4Var.dismiss();
                return;
            default:
                wr4Var.E0();
                return;
        }
    }
}
