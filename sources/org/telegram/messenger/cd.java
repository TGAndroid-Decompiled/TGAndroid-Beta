package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f16116a;
    public final MessagesController f16117b;
    public final TLRPC.TL_help_peerColors f16118c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16116a = i10;
        this.f16117b = messagesController;
        this.f16118c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16116a) {
            case 0:
                this.f16117b.lambda$checkPeerColors$492(this.f16118c);
                return;
            default:
                this.f16117b.lambda$checkPeerColors$490(this.f16118c);
                return;
        }
    }
}
