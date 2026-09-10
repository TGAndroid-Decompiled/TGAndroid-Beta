package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ld implements Runnable {
    public final int f15708a;
    public final MessagesController f15709b;
    public final TLRPC.TL_help_peerColors f15710c;

    public ld(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f15708a = i10;
        this.f15709b = messagesController;
        this.f15710c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f15708a) {
            case 0:
                this.f15709b.lambda$checkPeerColors$492(this.f15710c);
                return;
            default:
                this.f15709b.lambda$checkPeerColors$490(this.f15710c);
                return;
        }
    }
}
