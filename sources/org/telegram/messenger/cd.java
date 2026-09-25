package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f16131a;
    public final MessagesController f16132b;
    public final TLRPC.TL_help_peerColors f16133c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16131a = i10;
        this.f16132b = messagesController;
        this.f16133c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16131a) {
            case 0:
                this.f16132b.lambda$checkPeerColors$492(this.f16133c);
                return;
            default:
                this.f16132b.lambda$checkPeerColors$490(this.f16133c);
                return;
        }
    }
}
