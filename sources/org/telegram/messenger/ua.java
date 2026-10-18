package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ua implements Runnable {
    public final int f19650a;
    public final MessagesController f19651b;
    public final TLRPC.TL_help_peerColors f19652c;

    public ua(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f19650a = i10;
        this.f19651b = messagesController;
        this.f19652c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f19650a) {
            case 0:
                this.f19651b.lambda$checkPeerColors$493(this.f19652c);
                return;
            default:
                this.f19651b.lambda$checkPeerColors$495(this.f19652c);
                return;
        }
    }
}
