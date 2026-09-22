package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f16206a;
    public final MessagesController f16207b;
    public final TLRPC.TL_help_peerColors f16208c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16206a = i10;
        this.f16207b = messagesController;
        this.f16208c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16206a) {
            case 0:
                this.f16207b.lambda$checkPeerColors$492(this.f16208c);
                return;
            default:
                this.f16207b.lambda$checkPeerColors$490(this.f16208c);
                return;
        }
    }
}
