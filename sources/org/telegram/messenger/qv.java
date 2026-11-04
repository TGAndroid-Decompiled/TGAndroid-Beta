package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qv implements Runnable {
    public final int f24986a;
    public final vv f24987b;
    public final TLRPC.TL_encryptedChatDiscarded f24988c;

    public qv(vv vvVar, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded, int i3) {
        this.f24986a = i3;
        this.f24987b = vvVar;
        this.f24988c = tL_encryptedChatDiscarded;
    }

    @Override
    public final void run() {
        int i3 = this.f24986a;
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = this.f24988c;
        vv vvVar = this.f24987b;
        switch (i3) {
            case 0:
                vvVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                vvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
            default:
                vvVar.getMessagesController().U3(tL_encryptedChatDiscarded, false);
                vvVar.getMessagesStorage().V1(tL_encryptedChatDiscarded);
                vvVar.getNotificationCenter().k(35, tL_encryptedChatDiscarded);
                return;
        }
    }
}
