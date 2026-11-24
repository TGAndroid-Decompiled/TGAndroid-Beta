package defpackage;
public final class uz4 implements Runnable {
    public final byte a;
    public final dz3 b;
    public final int c;

    public uz4(dz3 dz3Var, int i, byte b) {
        this.a = b;
        this.b = dz3Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        dz3 dz3Var = this.b;
        switch (b) {
            case 0:
                ew6 ew6Var = ((wz4) ((in3) dz3Var.f).d).d;
                if (ew6Var != null) {
                    ew6Var.j(i);
                    return;
                }
                return;
            default:
                ew6 ew6Var2 = ((wz4) ((in3) dz3Var.f).d).d;
                if (ew6Var2 != null) {
                    ew6Var2.k(i);
                    return;
                }
                return;
        }
    }
}
