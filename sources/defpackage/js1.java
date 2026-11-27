package defpackage;
public final class js1 implements Runnable {
    public final byte a;
    public final ks1 b;

    public js1(ks1 ks1Var, byte b) {
        this.a = b;
        this.b = ks1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ks1 ks1Var = this.b;
        switch (b) {
            case 0:
                nr1 nr1Var = ks1Var.I.a0;
                if (nr1Var != null) {
                    nr1Var.o1();
                    return;
                }
                return;
            default:
                nr1 nr1Var2 = ks1Var.I.a0;
                if (nr1Var2 != null) {
                    nr1Var2.U0 = false;
                    my1 my1Var = nr1Var2.V0;
                    if (my1Var != null) {
                        my1Var.s(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
