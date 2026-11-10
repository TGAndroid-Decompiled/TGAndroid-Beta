package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f26393a;
    public final dw f26394b;
    public final TLRPC.EncryptedChat f26395c;

    public wv(dw dwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26393a = i7;
        this.f26394b = dwVar;
        this.f26395c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26393a;
        TLRPC.EncryptedChat encryptedChat = this.f26395c;
        dw dwVar = this.f26394b;
        switch (i7) {
            case 0:
                dwVar.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                dwVar.getNotificationCenter().k(35, encryptedChat);
                dwVar.w(encryptedChat, null);
                return;
            default:
                dwVar.getNotificationCenter().k(35, encryptedChat);
                dwVar.w(encryptedChat, null);
                return;
        }
    }
}
