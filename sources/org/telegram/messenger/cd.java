package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f15873a;
    public final MessagesController f15874b;
    public final TLRPC.TL_help_peerColors f15875c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f15873a = i10;
        this.f15874b = messagesController;
        this.f15875c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f15873a) {
            case 0:
                this.f15874b.lambda$checkPeerColors$492(this.f15875c);
                return;
            default:
                this.f15874b.lambda$checkPeerColors$490(this.f15875c);
                return;
        }
    }
}
