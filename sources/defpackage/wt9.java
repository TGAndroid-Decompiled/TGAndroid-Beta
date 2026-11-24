package defpackage;

import org.telegram.tgnet.TLRPC;
public final class wt9 implements Runnable {
    public final byte a;
    public final bu9 b;
    public final TLRPC.TL_encryptedChatDiscarded c;

    public wt9(bu9 bu9Var, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                bu9Var.getMessagesController().W3(tL_encryptedChatDiscarded, false);
                bu9Var.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                bu9Var.getMessagesController().W3(tL_encryptedChatDiscarded, false);
                bu9Var.getMessagesStorage().S1(tL_encryptedChatDiscarded);
                bu9Var.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
