package defpackage;
public final class ko2 implements Runnable {
    public final byte a;
    public final po2 b;

    public ko2(po2 po2Var, byte b) {
        this.a = b;
        this.b = po2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        po2 po2Var = this.b;
        switch (b) {
            case 0:
                po2Var.b0();
                return;
            default:
                nm7 notificationCenter = po2Var.getNotificationCenter();
                int i = oc7.s5;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
