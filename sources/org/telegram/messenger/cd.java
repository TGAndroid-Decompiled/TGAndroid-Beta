package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class cd implements Runnable {

    public final int f19958a;

    public final MessagesController f19959b;

    public final TLRPC.TL_help_peerColors f19960c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19958a = i10;
        this.f19959b = messagesController;
        this.f19960c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19958a) {
            case 0:
                this.f19959b.lambda$checkPeerColors$492(this.f19960c);
                break;
            default:
                this.f19959b.lambda$checkPeerColors$490(this.f19960c);
                break;
        }
    }
}
