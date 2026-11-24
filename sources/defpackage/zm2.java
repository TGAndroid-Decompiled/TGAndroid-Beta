package defpackage;
public final class zm2 implements Runnable {
    public final byte a;
    public final en2 b;

    public zm2(en2 en2Var, byte b) {
        this.a = b;
        this.b = en2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        en2 en2Var = this.b;
        switch (b) {
            case 0:
                en2Var.a0();
                return;
            default:
                kk7 notificationCenter = en2Var.getNotificationCenter();
                int i = na7.q5;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
