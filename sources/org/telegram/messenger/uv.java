package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f26880a;
    public final bw f26881b;
    public final TLRPC.EncryptedChat f26882c;

    public uv(bw bwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26880a = i7;
        this.f26881b = bwVar;
        this.f26882c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26880a;
        TLRPC.EncryptedChat encryptedChat = this.f26882c;
        bw bwVar = this.f26881b;
        switch (i7) {
            case 0:
                bwVar.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                bwVar.getNotificationCenter().k(35, encryptedChat);
                bwVar.w(encryptedChat, null);
                return;
            default:
                bwVar.getNotificationCenter().k(35, encryptedChat);
                bwVar.w(encryptedChat, null);
                return;
        }
    }
}
