package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f16151a;
    public final MessagesController f16152b;
    public final TLRPC.TL_help_peerColors f16153c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16151a = i10;
        this.f16152b = messagesController;
        this.f16153c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16151a) {
            case 0:
                this.f16152b.lambda$checkPeerColors$492(this.f16153c);
                return;
            default:
                this.f16152b.lambda$checkPeerColors$490(this.f16153c);
                return;
        }
    }
}
