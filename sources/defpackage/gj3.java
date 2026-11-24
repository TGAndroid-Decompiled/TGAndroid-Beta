package defpackage;
public final class gj3 implements Runnable {
    public final byte a;
    public final oj3 b;

    public gj3(oj3 oj3Var, byte b) {
        this.a = b;
        this.b = oj3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oj3 oj3Var = this.b;
        switch (b) {
            case 0:
                for (bj3 bj3Var : oj3Var.S.f0) {
                    ((t26) bj3Var.a.getLayoutManager()).u = false;
                }
                return;
            default:
                oj3Var.K();
                return;
        }
    }
}
