package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qv implements Runnable {
    public final int f26468a;
    public final xv f26469b;
    public final TLRPC.EncryptedChat f26470c;

    public qv(xv xvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26468a = i7;
        this.f26469b = xvVar;
        this.f26470c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26468a;
        TLRPC.EncryptedChat encryptedChat = this.f26470c;
        xv xvVar = this.f26469b;
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
