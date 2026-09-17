package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f17427a;
    public final MessagesController f17428b;
    public final TLRPC.TL_help_peerColors f17429c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17427a = i10;
        this.f17428b = messagesController;
        this.f17429c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17427a) {
            case 0:
                this.f17428b.lambda$checkPeerColors$492(this.f17429c);
                return;
            default:
                this.f17428b.lambda$checkPeerColors$490(this.f17429c);
                return;
        }
    }
}
