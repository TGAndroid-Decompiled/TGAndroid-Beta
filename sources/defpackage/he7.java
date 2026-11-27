package defpackage;

import org.telegram.tgnet.TLRPC;
public final class he7 implements Runnable {
    public final byte a;
    public final jf7 b;
    public final TLRPC.TL_chatFull c;

    public he7(jf7 jf7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = tL_chatFull;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        jf7 jf7Var = this.b;
        switch (b) {
            case 0:
                jn7 notificationCenter = jf7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(31, tL_chatFull, 0, bool, bool);
                return;
            default:
                jn7 notificationCenter2 = jf7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(31, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
