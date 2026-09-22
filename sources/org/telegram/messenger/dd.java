package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f15963a;
    public final MessagesController f15964b;
    public final TLRPC.TL_help_peerColors f15965c;

    public dd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f15963a = i10;
        this.f15964b = messagesController;
        this.f15965c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f15963a) {
            case 0:
                this.f15964b.lambda$checkPeerColors$492(this.f15965c);
                return;
            default:
                this.f15964b.lambda$checkPeerColors$490(this.f15965c);
                return;
        }
    }
}
