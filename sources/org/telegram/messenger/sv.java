package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sv implements Runnable {
    public final int f26884a;
    public final xv f26885b;
    public final TLRPC.TL_encryptedChatDiscarded f26886c;

    public sv(xv xvVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f26884a = i7;
        this.f26885b = xvVar;
        this.f26886c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f26884a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f26886c;
        xv xvVar = this.f26885b;
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
