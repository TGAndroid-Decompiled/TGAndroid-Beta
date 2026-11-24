package defpackage;
public final class g33 implements Runnable {
    public final byte a;
    public final h33 b;
    public final vu4 c;

    public g33(h33 h33Var, vu4 vu4Var, byte b) {
        this.a = b;
        this.b = h33Var;
        this.c = vu4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vu4 vu4Var = this.c;
        h33 h33Var = this.b;
        switch (b) {
            case 0:
                h33Var.e().A(vu4Var);
                return;
            case 1:
                h33Var.e().A(vu4Var);
                return;
            default:
                h33Var.e().A(vu4Var);
                return;
        }
    }
}
