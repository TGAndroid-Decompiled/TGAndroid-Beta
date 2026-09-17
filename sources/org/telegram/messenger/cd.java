package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f17400a;
    public final MessagesController f17401b;
    public final TLRPC.TL_help_peerColors f17402c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17400a = i10;
        this.f17401b = messagesController;
        this.f17402c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17400a) {
            case 0:
                this.f17401b.lambda$checkPeerColors$492(this.f17402c);
                return;
            default:
                this.f17401b.lambda$checkPeerColors$490(this.f17402c);
                return;
        }
    }
}
