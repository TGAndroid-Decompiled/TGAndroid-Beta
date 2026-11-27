package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ie7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final TLRPC.TL_chatFull c;

    public ie7(kf7 kf7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = tL_chatFull;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                jn7 notificationCenter = kf7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(31, tL_chatFull, 0, bool, bool);
                return;
            default:
                jn7 notificationCenter2 = kf7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(31, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
