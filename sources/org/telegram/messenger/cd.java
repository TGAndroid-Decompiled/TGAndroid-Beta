package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f17580a;
    public final MessagesController f17581b;
    public final TLRPC.TL_help_peerColors f17582c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f17580a = i10;
        this.f17581b = messagesController;
        this.f17582c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f17580a) {
            case 0:
                this.f17581b.lambda$checkPeerColors$492(this.f17582c);
                return;
            default:
                this.f17581b.lambda$checkPeerColors$490(this.f17582c);
                return;
        }
    }
}
