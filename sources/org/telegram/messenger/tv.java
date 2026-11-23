package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tv implements Runnable {
    public final int f27076a;
    public final yv f27077b;
    public final TLRPC.TL_encryptedChatDiscarded f27078c;

    public tv(yv yvVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i7) {
        this.f27076a = i7;
        this.f27077b = yvVar;
        this.f27078c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i7 = this.f27076a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f27078c;
        yv yvVar = this.f27077b;
        switch (i7) {
            case 0:
                yvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                yvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                yvVar.getMessagesController().b4(tL_encryptedChatDiscarded, false);
                yvVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                yvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
