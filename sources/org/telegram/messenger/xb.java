package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f21823a;
    public final MessagesController f21824b;
    public final TLRPC.TL_help_peerColors f21825c;

    public xb(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f21823a = i10;
        this.f21824b = messagesController;
        this.f21825c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f21823a) {
            case 0:
                this.f21824b.lambda$checkPeerColors$497(this.f21825c);
                return;
            default:
                this.f21824b.lambda$checkPeerColors$495(this.f21825c);
                return;
        }
    }
}
