package defpackage;
public final class sx4 implements Runnable {
    public final byte a;
    public final tx3 b;
    public final int c;

    public sx4(tx3 tx3Var, int i, byte b) {
        this.a = b;
        this.b = tx3Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        tx3 tx3Var = this.b;
        switch (b) {
            case 0:
                eu6 eu6Var = ((ux4) ((xl3) tx3Var.f).d).d;
                if (eu6Var != null) {
                    eu6Var.j(i);
                    return;
                }
                return;
            default:
                eu6 eu6Var2 = ((ux4) ((xl3) tx3Var.f).d).d;
                if (eu6Var2 != null) {
                    eu6Var2.k(i);
                    return;
                }
                return;
        }
    }
}
