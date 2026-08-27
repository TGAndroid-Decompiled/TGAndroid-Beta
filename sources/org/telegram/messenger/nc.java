package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class nc implements Runnable {

    public final int f21062a = 1;

    public final MessagesController f21063b;

    public final long f21064c;
    public final TLObject d;

    public nc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f21063b = messagesController;
        this.f21064c = j10;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21062a) {
            case 0:
                this.f21063b.lambda$deleteUserPhoto$114(this.d, this.f21064c);
                break;
            default:
                this.f21063b.lambda$loadPeerSettings$79(this.f21064c, this.d);
                break;
        }
    }

    public nc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f21063b = messagesController;
        this.d = tLObject;
        this.f21064c = j10;
    }
}
