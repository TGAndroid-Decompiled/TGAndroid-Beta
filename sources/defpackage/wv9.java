package defpackage;

import org.telegram.tgnet.TLRPC;
public final class wv9 implements Runnable {
    public final byte a;
    public final dw9 b;
    public final TLRPC.EncryptedChat c;

    public wv9(dw9 dw9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = dw9Var;
        this.c = encryptedChat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        dw9 dw9Var = this.b;
        switch (b) {
            case 0:
                dw9Var.getNotificationCenter().k(36, encryptedChat);
                return;
            case 1:
                dw9Var.getNotificationCenter().k(36, encryptedChat);
                dw9Var.w(encryptedChat, null);
                return;
            default:
                dw9Var.getNotificationCenter().k(36, encryptedChat);
                dw9Var.w(encryptedChat, null);
                return;
        }
    }
}
