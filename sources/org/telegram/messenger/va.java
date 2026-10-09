package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class va implements Runnable {
    public final int f19415a;
    public final MessagesController f19416b;
    public final TLRPC.TL_help_peerColors f19417c;

    public va(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19415a = i10;
        this.f19416b = messagesController;
        this.f19417c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19415a) {
            case 0:
                this.f19416b.lambda$checkPeerColors$493(this.f19417c);
                return;
            default:
                this.f19416b.lambda$checkPeerColors$495(this.f19417c);
                return;
        }
    }
}
