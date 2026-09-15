package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f15966a;
    public final MessagesController f15967b;
    public final TLRPC.TL_help_peerColors f15968c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f15966a = i10;
        this.f15967b = messagesController;
        this.f15968c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f15966a) {
            case 0:
                this.f15967b.lambda$checkPeerColors$492(this.f15968c);
                return;
            default:
                this.f15967b.lambda$checkPeerColors$490(this.f15968c);
                return;
        }
    }
}
