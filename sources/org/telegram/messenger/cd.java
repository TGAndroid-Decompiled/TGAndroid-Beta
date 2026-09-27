package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f16125a;
    public final MessagesController f16126b;
    public final TLRPC.TL_help_peerColors f16127c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16125a = i10;
        this.f16126b = messagesController;
        this.f16127c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16125a) {
            case 0:
                this.f16126b.lambda$checkPeerColors$492(this.f16127c);
                return;
            default:
                this.f16126b.lambda$checkPeerColors$490(this.f16127c);
                return;
        }
    }
}
