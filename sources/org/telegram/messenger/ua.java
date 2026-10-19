package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ua implements Runnable {
    public final int f19647a;
    public final MessagesController f19648b;
    public final TLRPC.TL_help_peerColors f19649c;

    public ua(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19647a = i10;
        this.f19648b = messagesController;
        this.f19649c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19647a) {
            case 0:
                this.f19648b.lambda$checkPeerColors$493(this.f19649c);
                return;
            default:
                this.f19648b.lambda$checkPeerColors$495(this.f19649c);
                return;
        }
    }
}
