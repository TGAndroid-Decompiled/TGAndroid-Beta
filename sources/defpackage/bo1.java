package defpackage;
public final class bo1 implements Runnable {
    public final byte a;
    public final bu5 b;

    public bo1(bu5 bu5Var, byte b) {
        this.a = b;
        this.b = bu5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                bu5Var.r();
                return;
            case 1:
                bu5Var.r();
                return;
            case 2:
                bu5Var.r();
                return;
            case 3:
                wt5 wt5Var = bu5Var.m;
                if (wt5Var != null) {
                    gm.t1(wt5Var.getContentView());
                    return;
                }
                return;
            case 4:
                wt5 wt5Var2 = bu5Var.m;
                if (wt5Var2 != null) {
                    gm.t1(wt5Var2.getContentView());
                    return;
                }
                return;
            case 5:
                wt5 wt5Var3 = bu5Var.m;
                if (wt5Var3 != null) {
                    gm.t1(wt5Var3.getContentView());
                    return;
                }
                return;
            case 6:
                wt5 wt5Var4 = bu5Var.m;
                if (wt5Var4 != null) {
                    gm.t1(wt5Var4.getContentView());
                    return;
                }
                return;
            case 7:
                wt5 wt5Var5 = bu5Var.m;
                if (wt5Var5 != null) {
                    gm.t1(wt5Var5.getContentView());
                    return;
                }
                return;
            case 8:
                wt5 wt5Var6 = bu5Var.m;
                if (wt5Var6 != null) {
                    gm.t1(wt5Var6.getContentView());
                    return;
                }
                return;
            case 9:
                bu5Var.r();
                return;
            case 10:
                bu5Var.r();
                return;
            default:
                bu5Var.u();
                return;
        }
    }
}
