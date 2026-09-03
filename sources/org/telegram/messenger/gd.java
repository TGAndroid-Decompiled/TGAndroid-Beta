package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gd implements Runnable {
    public final int f18763a;
    public final MessagesController f18764b;
    public final TLRPC.TL_help_peerColors f18765c;

    public gd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f18763a = i10;
        this.f18764b = messagesController;
        this.f18765c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f18763a) {
            case 0:
                this.f18764b.lambda$checkPeerColors$492(this.f18765c);
                return;
            default:
                this.f18764b.lambda$checkPeerColors$490(this.f18765c);
                return;
        }
    }
}
