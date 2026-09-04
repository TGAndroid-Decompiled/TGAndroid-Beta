package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f17475a;
    public final MessagesController f17476b;
    public final TLRPC.TL_help_peerColors f17477c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17475a = i10;
        this.f17476b = messagesController;
        this.f17477c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17475a) {
            case 0:
                this.f17476b.lambda$checkPeerColors$492(this.f17477c);
                return;
            default:
                this.f17476b.lambda$checkPeerColors$490(this.f17477c);
                return;
        }
    }
}
