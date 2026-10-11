package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class va implements Runnable {
    public final int f19453a;
    public final MessagesController f19454b;
    public final TLRPC.TL_help_peerColors f19455c;

    public va(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19453a = i10;
        this.f19454b = messagesController;
        this.f19455c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19453a) {
            case 0:
                this.f19454b.lambda$checkPeerColors$493(this.f19455c);
                return;
            default:
                this.f19454b.lambda$checkPeerColors$495(this.f19455c);
                return;
        }
    }
}
