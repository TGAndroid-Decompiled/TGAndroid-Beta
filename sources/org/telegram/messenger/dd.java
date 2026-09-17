package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f15975a;
    public final MessagesController f15976b;
    public final TLRPC.TL_help_peerColors f15977c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f15975a = i10;
        this.f15976b = messagesController;
        this.f15977c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f15975a) {
            case 0:
                this.f15976b.lambda$checkPeerColors$492(this.f15977c);
                return;
            default:
                this.f15976b.lambda$checkPeerColors$490(this.f15977c);
                return;
        }
    }
}
