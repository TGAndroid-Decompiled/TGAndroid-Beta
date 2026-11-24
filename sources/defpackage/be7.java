package defpackage;

import org.telegram.tgnet.TLRPC;
public final class be7 implements Runnable {
    public final byte a;
    public final cf7 b;
    public final TLRPC.TL_chatFull c;

    public be7(cf7 cf7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = tL_chatFull;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                nm7 notificationCenter = cf7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(31, tL_chatFull, 0, bool, bool);
                return;
            default:
                nm7 notificationCenter2 = cf7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(31, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
