package defpackage;
public final class ip3 implements Runnable {
    public final byte a;
    public final op3 b;

    public ip3(op3 op3Var, byte b) {
        this.a = b;
        this.b = op3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        op3 op3Var = this.b;
        switch (b) {
            case 0:
                op3Var.b();
                return;
            case 1:
                op3Var.e = false;
                lp3 lp3Var = op3Var.s;
                if (lp3Var != null) {
                    lp3Var.a(true);
                    op3Var.s = null;
                }
                np3 np3Var = op3Var.n;
                if (np3Var != null) {
                    np3Var.a();
                }
                op3Var.c = false;
                op3Var.d();
                return;
            default:
                if (op3Var.c && op3Var.r != null) {
                    op3Var.n.b(2131624012, 3500, k96.N0("VideoConvertFail"));
                    op3Var.c = false;
                    op3Var.d();
                    return;
                }
                return;
        }
    }
}
