package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sv implements Runnable {
    public final int f26912a;
    public final xv f26913b;
    public final TLRPC.TL_encryptedChatDiscarded f26914c;

    public sv(xv xvVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f26912a = i7;
        this.f26913b = xvVar;
        this.f26914c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f26912a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f26914c;
        xv xvVar = this.f26913b;
        switch (i7) {
            case 0:
                xvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                xvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                xvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                xvVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                xvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
