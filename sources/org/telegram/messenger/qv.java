package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qv implements Runnable {
    public final int f26578a;
    public final xv f26579b;
    public final TLRPC.EncryptedChat f26580c;

    public qv(xv xvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26578a = i7;
        this.f26579b = xvVar;
        this.f26580c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26578a;
        TLRPC.EncryptedChat encryptedChat = this.f26580c;
        xv xvVar = this.f26579b;
        switch (i7) {
            case 0:
                xvVar.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                xvVar.getNotificationCenter().k(35, encryptedChat);
                xvVar.w(encryptedChat, null);
                return;
            default:
                xvVar.getNotificationCenter().k(35, encryptedChat);
                xvVar.w(encryptedChat, null);
                return;
        }
    }
}
