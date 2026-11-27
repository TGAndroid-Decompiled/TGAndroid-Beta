package defpackage;

import org.telegram.tgnet.TLRPC;
public final class px9 implements Runnable {
    public final byte a;
    public final wx9 b;
    public final TLRPC.EncryptedChat c;

    public px9(wx9 wx9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = encryptedChat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                wx9Var.getNotificationCenter().k(36, encryptedChat);
                wx9Var.w(encryptedChat, null);
                return;
            case 1:
                wx9Var.getNotificationCenter().k(36, encryptedChat);
                wx9Var.w(encryptedChat, null);
                return;
            default:
                wx9Var.getNotificationCenter().k(36, encryptedChat);
                return;
        }
    }
}
