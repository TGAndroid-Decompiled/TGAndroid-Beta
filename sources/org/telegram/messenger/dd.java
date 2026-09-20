package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f16191a;
    public final MessagesController f16192b;
    public final TLRPC.TL_help_peerColors f16193c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16191a = i10;
        this.f16192b = messagesController;
        this.f16193c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16191a) {
            case 0:
                this.f16192b.lambda$checkPeerColors$492(this.f16193c);
                return;
            default:
                this.f16192b.lambda$checkPeerColors$490(this.f16193c);
                return;
        }
    }
}
