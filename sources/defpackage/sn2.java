package defpackage;
public final class sn2 implements Runnable {
    public final byte a;
    public final xn2 b;

    public sn2(xn2 xn2Var, byte b) {
        this.a = b;
        this.b = xn2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xn2 xn2Var = this.b;
        switch (b) {
            case 0:
                xn2Var.a0();
                return;
            default:
                jn7 notificationCenter = xn2Var.getNotificationCenter();
                int i = uc7.r5;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
