package defpackage;
public final class yp5 implements Runnable {
    public final byte a;
    public final bq5 b;

    public yp5(bq5 bq5Var, byte b) {
        this.a = b;
        this.b = bq5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bq5 bq5Var = this.b;
        switch (b) {
            case 0:
                v01 v01Var = bq5Var.A;
                if (v01Var != null) {
                    bq5Var.a.g(v01Var);
                    bq5Var.A = null;
                    return;
                }
                return;
            default:
                bq5Var.a(null, true, null);
                return;
        }
    }
}
