package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wa implements Runnable {
    public final int f19972a;
    public final MessagesController f19973b;
    public final TLRPC.TL_help_peerColors f19974c;

    public wa(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19972a = i10;
        this.f19973b = messagesController;
        this.f19974c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19972a) {
            case 0:
                this.f19973b.lambda$checkPeerColors$493(this.f19974c);
                return;
            default:
                this.f19973b.lambda$checkPeerColors$495(this.f19974c);
                return;
        }
    }
}
