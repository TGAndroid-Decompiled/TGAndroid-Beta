package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jw implements Runnable {
    public final int f16470a;
    public final ow f16471b;
    public final TLRPC.TL_encryptedChatDiscarded f16472c;

    public jw(ow owVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i10) {
        this.f16470a = i10;
        this.f16471b = owVar;
        this.f16472c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i10 = this.f16470a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f16472c;
        ow owVar = this.f16471b;
        switch (i10) {
            case 0:
                owVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                owVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                owVar.getMessagesController().R3(tL_encryptedChatDiscarded, false);
                owVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                owVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
