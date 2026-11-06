package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f26383a;
    public final dw f26384b;
    public final TLRPC.EncryptedChat f26385c;

    public wv(dw dwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26383a = i7;
        this.f26384b = dwVar;
        this.f26385c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26383a;
        TLRPC.EncryptedChat encryptedChat = this.f26385c;
        dw dwVar = this.f26384b;
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
