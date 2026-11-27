package defpackage;

import org.telegram.tgnet.TLRPC;
public final class qx9 implements Runnable {
    public final byte a;
    public final wx9 b;
    public final TLRPC.TL_encryptedChatDiscarded c;

    public qx9(wx9 wx9Var, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                wx9Var.getMessagesController().f4(tL_encryptedChatDiscarded, false);
                wx9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                return;
            default:
                wx9Var.getMessagesController().f4(tL_encryptedChatDiscarded, false);
                wx9Var.getMessagesStorage().S1(tL_encryptedChatDiscarded);
                wx9Var.getNotificationCenter().k(36, tL_encryptedChatDiscarded);
                return;
        }
    }
}
