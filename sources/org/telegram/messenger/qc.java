package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qc implements Runnable {
    public final int f19776a = 1;
    public final MessagesController f19777b;
    public final long f19778c;
    public final TLObject d;

    public qc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f19777b = messagesController;
        this.f19778c = j10;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19776a) {
            case 0:
                this.f19777b.lambda$deleteUserPhoto$114(this.d, this.f19778c);
                return;
            default:
                this.f19777b.lambda$loadPeerSettings$79(this.f19778c, this.d);
                return;
        }
    }

    public qc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f19777b = messagesController;
        this.d = tLObject;
        this.f19778c = j10;
    }
}
