package defpackage;

import org.telegram.tgnet.TLRPC;
public final class yv9 implements Runnable {
    public final byte a;
    public final dw9 b;
    public final TLRPC.TL_encryptedChatDiscarded c;

    public yv9(dw9 dw9Var, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                dw9Var.getMessagesController().Z3(tL_encryptedChatDiscarded, false);
                dw9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                return;
            default:
                dw9Var.getMessagesController().Z3(tL_encryptedChatDiscarded, false);
                dw9Var.getMessagesStorage().S1(tL_encryptedChatDiscarded);
                dw9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                return;
        }
    }
}
