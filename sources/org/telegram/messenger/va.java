package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class va implements Runnable {
    public final int f19419a;
    public final MessagesController f19420b;
    public final TLRPC.TL_help_peerColors f19421c;

    public va(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19419a = i10;
        this.f19420b = messagesController;
        this.f19421c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19419a) {
            case 0:
                this.f19420b.lambda$checkPeerColors$493(this.f19421c);
                return;
            default:
                this.f19420b.lambda$checkPeerColors$495(this.f19421c);
                return;
        }
    }
}
