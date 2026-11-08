package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f26389a;
    public final dw f26390b;
    public final TLRPC.EncryptedChat f26391c;

    public wv(dw dwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26389a = i7;
        this.f26390b = dwVar;
        this.f26391c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26389a;
        TLRPC.EncryptedChat encryptedChat = this.f26391c;
        dw dwVar = this.f26390b;
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
