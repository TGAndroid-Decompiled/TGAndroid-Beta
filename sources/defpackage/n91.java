package defpackage;
public final class n91 implements Runnable {
    public final byte a;
    public final ia1 b;

    public n91(ia1 ia1Var, byte b) {
        this.a = b;
        this.b = ia1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ia1 ia1Var = this.b;
        switch (b) {
            case 0:
                ia1Var.k0(false);
                return;
            default:
                ia1Var.c0();
                return;
        }
    }
}
