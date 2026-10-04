package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f17575a;
    public final MessagesController f17576b;
    public final TLRPC.TL_help_peerColors f17577c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17575a = i10;
        this.f17576b = messagesController;
        this.f17577c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17575a) {
            case 0:
                this.f17576b.lambda$checkPeerColors$492(this.f17577c);
                return;
            default:
                this.f17576b.lambda$checkPeerColors$490(this.f17577c);
                return;
        }
    }
}
