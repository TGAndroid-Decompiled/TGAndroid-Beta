package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f26375a;
    public final dw f26376b;
    public final TLRPC.EncryptedChat f26377c;

    public wv(dw dwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26375a = i7;
        this.f26376b = dwVar;
        this.f26377c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26375a;
        TLRPC.EncryptedChat encryptedChat = this.f26377c;
        dw dwVar = this.f26376b;
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
