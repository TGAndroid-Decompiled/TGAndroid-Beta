package defpackage;
public final class kr3 implements Runnable {
    public final byte a;
    public final mr3 b;
    public final nr3 c;

    public kr3(mr3 mr3Var, nr3 nr3Var, byte b) {
        this.a = b;
        this.b = mr3Var;
        this.c = nr3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nr3 nr3Var = this.c;
        mr3 mr3Var = this.b;
        switch (b) {
            case 0:
                nr3Var.I(mr3Var.a, mr3Var.b);
                return;
            default:
                nr3Var.y(mr3Var.a, mr3Var.b);
                return;
        }
    }
}
