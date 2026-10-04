package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f17578a;
    public final MessagesController f17579b;
    public final TLRPC.TL_help_peerColors f17580c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17578a = i10;
        this.f17579b = messagesController;
        this.f17580c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17578a) {
            case 0:
                this.f17579b.lambda$checkPeerColors$492(this.f17580c);
                return;
            default:
                this.f17579b.lambda$checkPeerColors$490(this.f17580c);
                return;
        }
    }
}
