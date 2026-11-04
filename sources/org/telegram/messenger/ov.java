package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ov implements Runnable {
    public final int f24613a;
    public final vv f24614b;
    public final TLRPC.EncryptedChat f24615c;

    public ov(vv vvVar, TLRPC.EncryptedChat encryptedChat, int i3) {
        this.f24613a = i3;
        this.f24614b = vvVar;
        this.f24615c = encryptedChat;
    }

    @Override
    public final void run() {
        int i3 = this.f24613a;
        TLRPC.EncryptedChat encryptedChat = this.f24615c;
        vv vvVar = this.f24614b;
        switch (i3) {
            case 0:
                vvVar.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                vvVar.getNotificationCenter().k(35, encryptedChat);
                vvVar.w(encryptedChat, null);
                return;
            default:
                vvVar.getNotificationCenter().k(35, encryptedChat);
                vvVar.w(encryptedChat, null);
                return;
        }
    }
}
