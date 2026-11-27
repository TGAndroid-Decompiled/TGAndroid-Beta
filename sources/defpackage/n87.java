package defpackage;
public final class n87 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final m44 c;

    public n87(uc7 uc7Var, m44 m44Var, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = m44Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m44 m44Var = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                zh6 zh6Var = m44Var.c;
                int m = zh6Var.m();
                for (int i = 0; i < m; i++) {
                    uc7Var.getNotificationCenter().k(50, Long.valueOf(zh6Var.j(i)), zh6Var.n(i), Boolean.FALSE);
                }
                return;
            case 1:
                zh6 zh6Var2 = m44Var.c;
                int m2 = zh6Var2.m();
                for (int i2 = 0; i2 < m2; i2++) {
                    uc7Var.getNotificationCenter().k(50, Long.valueOf(zh6Var2.j(i2)), zh6Var2.n(i2), Boolean.FALSE);
                }
                return;
            default:
                zh6 zh6Var3 = m44Var.c;
                if (!zh6Var3.i()) {
                    int m3 = zh6Var3.m();
                    for (int i3 = 0; i3 < m3; i3++) {
                        uc7Var.getNotificationCenter().k(1, Long.valueOf(zh6Var3.j(i3)), zh6Var3.n(i3), Boolean.FALSE, 0);
                    }
                    return;
                }
                return;
        }
    }
}
