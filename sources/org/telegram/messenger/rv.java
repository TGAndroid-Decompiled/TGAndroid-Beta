package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rv implements Runnable {
    public final int f26677a;
    public final yv f26678b;
    public final TLRPC.EncryptedChat f26679c;

    public rv(yv yvVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26677a = i7;
        this.f26678b = yvVar;
        this.f26679c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26677a;
        TLRPC.EncryptedChat encryptedChat = this.f26679c;
        yv yvVar = this.f26678b;
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
