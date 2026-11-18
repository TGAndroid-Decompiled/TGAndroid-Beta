package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qv implements Runnable {
    public final int f26466a;
    public final xv f26467b;
    public final TLRPC.EncryptedChat f26468c;

    public qv(xv xvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26466a = i7;
        this.f26467b = xvVar;
        this.f26468c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26466a;
        TLRPC.EncryptedChat encryptedChat = this.f26468c;
        xv xvVar = this.f26467b;
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
