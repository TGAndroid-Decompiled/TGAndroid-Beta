package defpackage;
public final class h77 implements Runnable {
    public final byte a;
    public final na7 b;
    public final q34 c;

    public h77(na7 na7Var, q34 q34Var, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = q34Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        q34 q34Var = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                vf6 vf6Var = q34Var.c;
                int m = vf6Var.m();
                for (int i = 0; i < m; i++) {
                    na7Var.getNotificationCenter().k(49, Long.valueOf(vf6Var.j(i)), vf6Var.n(i), Boolean.FALSE);
                }
                return;
            case 1:
                vf6 vf6Var2 = q34Var.c;
                int m2 = vf6Var2.m();
                for (int i2 = 0; i2 < m2; i2++) {
                    na7Var.getNotificationCenter().k(49, Long.valueOf(vf6Var2.j(i2)), vf6Var2.n(i2), Boolean.FALSE);
                }
                return;
            default:
                vf6 vf6Var3 = q34Var.c;
                if (!vf6Var3.i()) {
                    int m3 = vf6Var3.m();
                    for (int i3 = 0; i3 < m3; i3++) {
                        na7Var.getNotificationCenter().k(1, Long.valueOf(vf6Var3.j(i3)), vf6Var3.n(i3), Boolean.FALSE, 0);
                    }
                    return;
                }
                return;
        }
    }
}
