package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hw implements Runnable {
    public final int f15970a;
    public final ow f15971b;
    public final TLRPC.EncryptedChat f15972c;

    public hw(ow owVar, TLRPC.EncryptedChat encryptedChat, int i10) {
        this.f15970a = i10;
        this.f15971b = owVar;
        this.f15972c = encryptedChat;
    }

    @Override
    public final void run() {
        int i10 = this.f15970a;
        TLRPC.EncryptedChat encryptedChat = this.f15972c;
        ow owVar = this.f15971b;
        switch (i10) {
            case 0:
                owVar.getNotificationCenter().k(35, encryptedChat);
                return;
            case 1:
                owVar.getNotificationCenter().k(35, encryptedChat);
                owVar.w(encryptedChat, null);
                return;
            default:
                owVar.getNotificationCenter().k(35, encryptedChat);
                owVar.w(encryptedChat, null);
                return;
        }
    }
}
