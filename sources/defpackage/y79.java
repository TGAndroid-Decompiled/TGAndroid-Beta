package defpackage;
public final class y79 implements Runnable {
    public final byte a;
    public final a89 b;

    public y79(a89 a89Var, byte b) {
        this.a = b;
        this.b = a89Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a89 a89Var = this.b;
        switch (b) {
            case 0:
                int i = a89Var.a;
                b89 b89Var = a89Var.w;
                if (i == 0) {
                    b89Var.dismiss();
                    return;
                } else {
                    b89Var.onBackPressed();
                    return;
                }
            default:
                gl.F3(a89Var.n.d);
                return;
        }
    }
}
