package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gd implements Runnable {
    public final int f17305a;
    public final MessagesController f17306b;
    public final TLRPC.TL_help_peerColors f17307c;

    public gd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17305a = i10;
        this.f17306b = messagesController;
        this.f17307c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17305a) {
            case 0:
                this.f17306b.lambda$checkPeerColors$492(this.f17307c);
                return;
            default:
                this.f17306b.lambda$checkPeerColors$490(this.f17307c);
                return;
        }
    }
}
