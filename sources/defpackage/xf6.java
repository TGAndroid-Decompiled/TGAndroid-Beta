package defpackage;
public final class xf6 implements Runnable {
    public final byte a;
    public final yf6 b;

    public xf6(yf6 yf6Var, byte b) {
        this.a = b;
        this.b = yf6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yf6 yf6Var = this.b;
        switch (b) {
            case 0:
                zf6 zf6Var = yf6Var.d;
                if (yf6Var.b) {
                    boolean z = zf6Var.M;
                    p09 p09Var = zf6Var.L;
                    cj1 cj1Var = zf6Var.n;
                    if (z && System.currentTimeMillis() - yf6Var.a >= 10000) {
                        cj1Var.setAnimation(p09Var);
                        p09Var.I(0, false, false);
                        p09Var.u0 = new xf6(yf6Var, (byte) 1);
                        cj1Var.d();
                        yf6Var.a = System.currentTimeMillis();
                    }
                    cj1Var.postDelayed(yf6Var.c, 1000L);
                    return;
                }
                return;
            case 1:
                gm.c3(new xf6(yf6Var, (byte) 2));
                return;
            default:
                zf6 zf6Var2 = yf6Var.d;
                p09 p09Var2 = zf6Var2.K;
                p09Var2.I(0, false, false);
                zf6Var2.n.setAnimation(p09Var2);
                return;
        }
    }
}
