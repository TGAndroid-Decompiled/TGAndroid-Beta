package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qc implements Runnable {
    public final int f18189a = 1;
    public final MessagesController f18190b;
    public final long f18191c;
    public final TLObject d;

    public qc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18190b = messagesController;
        this.f18191c = j10;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18189a) {
            case 0:
                this.f18190b.lambda$deleteUserPhoto$114(this.d, this.f18191c);
                return;
            default:
                this.f18190b.lambda$loadPeerSettings$79(this.f18191c, this.d);
                return;
        }
    }

    public qc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18190b = messagesController;
        this.d = tLObject;
        this.f18191c = j10;
    }
}
