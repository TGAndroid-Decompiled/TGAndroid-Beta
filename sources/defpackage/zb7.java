package defpackage;

import org.telegram.tgnet.TLRPC;
public final class zb7 implements Runnable {
    public final byte a;
    public final ad7 b;
    public final TLRPC.TL_chatFull c;

    public zb7(ad7 ad7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = tL_chatFull;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        ad7 ad7Var = this.b;
        switch (b) {
            case 0:
                kk7 notificationCenter = ad7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                kk7 notificationCenter2 = ad7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
