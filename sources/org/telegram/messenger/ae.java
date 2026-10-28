package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ae implements Runnable {
    public final int f19623a;
    public final MessagesController f19624b;
    public final TLRPC.TL_help_peerColors f19625c;

    public ae(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19623a = i10;
        this.f19624b = messagesController;
        this.f19625c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19623a) {
            case 0:
                this.f19624b.lambda$checkPeerColors$496(this.f19625c);
                return;
            default:
                this.f19624b.lambda$checkPeerColors$498(this.f19625c);
                return;
        }
    }
}
