package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gd implements Runnable {
    public final int f17287a;
    public final MessagesController f17288b;
    public final TLRPC.TL_help_peerColors f17289c;

    public gd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17287a = i10;
        this.f17288b = messagesController;
        this.f17289c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17287a) {
            case 0:
                this.f17288b.lambda$checkPeerColors$492(this.f17289c);
                return;
            default:
                this.f17288b.lambda$checkPeerColors$490(this.f17289c);
                return;
        }
    }
}
