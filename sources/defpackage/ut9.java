package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ut9 implements Runnable {
    public final byte a;
    public final bu9 b;
    public final TLRPC.EncryptedChat c;

    public ut9(bu9 bu9Var, TLRPC.EncryptedChat encryptedChat, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = encryptedChat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.EncryptedChat encryptedChat = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                bu9Var.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                bu9Var.getNotificationCenter().k(35, encryptedChat);
                bu9Var.w(encryptedChat, null);
                return;
            default:
                bu9Var.getNotificationCenter().k(35, encryptedChat);
                bu9Var.w(encryptedChat, null);
                return;
        }
    }
}
