package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class va implements Runnable {
    public final int f19728a;
    public final MessagesController f19729b;
    public final TLRPC.TL_help_peerColors f19730c;

    public va(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19728a = i10;
        this.f19729b = messagesController;
        this.f19730c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19728a) {
            case 0:
                this.f19729b.lambda$checkPeerColors$493(this.f19730c);
                return;
            default:
                this.f19729b.lambda$checkPeerColors$495(this.f19730c);
                return;
        }
    }
}
