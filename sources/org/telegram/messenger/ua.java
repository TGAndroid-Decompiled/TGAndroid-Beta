package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ua implements Runnable {
    public final int f19646a;
    public final MessagesController f19647b;
    public final TLRPC.TL_help_peerColors f19648c;

    public ua(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19646a = i10;
        this.f19647b = messagesController;
        this.f19648c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19646a) {
            case 0:
                this.f19647b.lambda$checkPeerColors$493(this.f19648c);
                return;
            default:
                this.f19647b.lambda$checkPeerColors$495(this.f19648c);
                return;
        }
    }
}
