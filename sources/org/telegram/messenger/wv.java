package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f27419a;
    public final bw f27420b;
    public final TLRPC.TL_encryptedChatDiscarded f27421c;

    public wv(bw bwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f27419a = i7;
        this.f27420b = bwVar;
        this.f27421c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f27419a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f27421c;
        bw bwVar = this.f27420b;
        switch (i7) {
            case 0:
                bwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                bwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                bwVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                bwVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                bwVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
