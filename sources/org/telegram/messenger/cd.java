package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f16142a;
    public final MessagesController f16143b;
    public final TLRPC.TL_help_peerColors f16144c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16142a = i10;
        this.f16143b = messagesController;
        this.f16144c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16142a) {
            case 0:
                this.f16143b.lambda$checkPeerColors$492(this.f16144c);
                return;
            default:
                this.f16143b.lambda$checkPeerColors$490(this.f16144c);
                return;
        }
    }
}
