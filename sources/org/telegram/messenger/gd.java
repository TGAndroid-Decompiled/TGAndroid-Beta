package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gd implements Runnable {
    public final int f18761a;
    public final MessagesController f18762b;
    public final TLRPC.TL_help_peerColors f18763c;

    public gd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f18761a = i10;
        this.f18762b = messagesController;
        this.f18763c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f18761a) {
            case 0:
                this.f18762b.lambda$checkPeerColors$492(this.f18763c);
                return;
            default:
                this.f18762b.lambda$checkPeerColors$490(this.f18763c);
                return;
        }
    }
}
