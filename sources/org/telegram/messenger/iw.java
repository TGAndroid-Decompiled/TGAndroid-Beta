package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class iw implements Runnable {
    public final int f16362a;
    public final pw f16363b;
    public final TLRPC.EncryptedChat f16364c;

    public iw(pw pwVar, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f16362a = i10;
        this.f16363b = pwVar;
        this.f16364c = encryptedChat;
    }

    @Override
    public final void run() {
        int i10 = this.f16362a;
        TLRPC.EncryptedChat encryptedChat = this.f16364c;
        pw pwVar = this.f16363b;
        switch (i10) {
            case 0:
                pwVar.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                pwVar.getNotificationCenter().k(35, encryptedChat);
                pwVar.w(encryptedChat, null);
                return;
            default:
                pwVar.getNotificationCenter().k(35, encryptedChat);
                pwVar.w(encryptedChat, null);
                return;
        }
    }
}
