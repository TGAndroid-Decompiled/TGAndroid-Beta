package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f16126a;
    public final MessagesController f16127b;
    public final TLRPC.TL_help_peerColors f16128c;

    public cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.f16126a = i10;
        this.f16127b = messagesController;
        this.f16128c = tL_help_peerColors;
    }

    @Override
    public final void run() {
        switch (this.f16126a) {
            case 0:
                this.f16127b.lambda$checkPeerColors$492(this.f16128c);
                return;
            default:
                this.f16127b.lambda$checkPeerColors$490(this.f16128c);
                return;
        }
    }
}
