package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f17577a;
    public final MessagesController f17578b;
    public final TLRPC.TL_help_peerColors f17579c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17577a = i10;
        this.f17578b = messagesController;
        this.f17579c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17577a) {
            case 0:
                this.f17578b.lambda$checkPeerColors$492(this.f17579c);
                return;
            default:
                this.f17578b.lambda$checkPeerColors$490(this.f17579c);
                return;
        }
    }
}
