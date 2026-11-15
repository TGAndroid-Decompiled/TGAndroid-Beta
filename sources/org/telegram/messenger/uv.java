package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uv implements Runnable {
    public final int f26881a;
    public final bw f26882b;
    public final TLRPC.EncryptedChat f26883c;

    public uv(bw bwVar, TLRPC.EncryptedChat encryptedChat, int i7) {
        this.f26881a = i7;
        this.f26882b = bwVar;
        this.f26883c = encryptedChat;
    }

    @Override
    public final void run() {
        int i7 = this.f26881a;
        TLRPC.EncryptedChat encryptedChat = this.f26883c;
        bw bwVar = this.f26882b;
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
