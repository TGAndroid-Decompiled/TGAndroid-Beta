package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f27420a;
    public final bw f27421b;
    public final TLRPC.TL_encryptedChatDiscarded f27422c;

    public wv(bw bwVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f27420a = i7;
        this.f27421b = bwVar;
        this.f27422c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f27420a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f27422c;
        bw bwVar = this.f27421b;
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
