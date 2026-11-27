package defpackage;
public final class wm3 implements Runnable {
    public final byte a;
    public final bn3 b;
    public final String c;

    public wm3(bn3 bn3Var, String str, byte b) {
        this.a = b;
        this.b = bn3Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        bn3 bn3Var = this.b;
        switch (b) {
            case 0:
                bn3Var.D(str);
                return;
            default:
                bn3Var.L = str;
                cm3 cm3Var = new cm3(r3c.F0(r3c.K0(str, null, null)), 0L, null, false);
                cm3Var.e = str;
                cm3Var.f = 2131232492;
                bn3Var.c(cm3Var);
                return;
        }
    }
}
