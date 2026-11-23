package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rv implements Runnable {
    public final int f26641a;
    public final yv f26642b;
    public final TLRPC.EncryptedChat f26643c;

    public rv(yv yvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26641a = i7;
        this.f26642b = yvVar;
        this.f26643c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26641a;
        TLRPC.EncryptedChat encryptedChat = this.f26643c;
        yv yvVar = this.f26642b;
        switch (i7) {
            case 0:
                yvVar.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                yvVar.getNotificationCenter().k(35, encryptedChat);
                yvVar.w(encryptedChat, null);
                return;
            default:
                yvVar.getNotificationCenter().k(35, encryptedChat);
                yvVar.w(encryptedChat, null);
                return;
        }
    }
}
