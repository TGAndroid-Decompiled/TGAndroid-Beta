package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kw implements Runnable {
    public final int f16823a;
    public final pw f16824b;
    public final TLRPC.TL_encryptedChatDiscarded f16825c;

    public kw(pw pwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16823a = i10;
        this.f16824b = pwVar;
        this.f16825c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i10 = this.f16823a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f16825c;
        pw pwVar = this.f16824b;
        switch (i10) {
            case 0:
                pwVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                pwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                pwVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                pwVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                pwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
