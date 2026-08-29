package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fd implements Runnable {
    public final int f20234a;
    public final MessagesController f20235b;
    public final TLRPC.TL_help_peerColors f20236c;

    public fd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f20234a = i10;
        this.f20235b = messagesController;
        this.f20236c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f20234a) {
            case 0:
                this.f20235b.lambda$checkPeerColors$492(this.f20236c);
                return;
            default:
                this.f20235b.lambda$checkPeerColors$490(this.f20236c);
                return;
        }
    }
}
