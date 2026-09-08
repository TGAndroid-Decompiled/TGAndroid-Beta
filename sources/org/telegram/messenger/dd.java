package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f17502a;
    public final MessagesController f17503b;
    public final TLRPC.TL_help_peerColors f17504c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17502a = i10;
        this.f17503b = messagesController;
        this.f17504c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17502a) {
            case 0:
                this.f17503b.lambda$checkPeerColors$492(this.f17504c);
                return;
            default:
                this.f17503b.lambda$checkPeerColors$490(this.f17504c);
                return;
        }
    }
}
