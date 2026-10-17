package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class bc implements Runnable {
    public final int f17939a = 0;
    public final MessagesController f17940b;
    public final TLObject f17941c;
    public final long d;

    public bc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f17940b = messagesController;
        this.d = j10;
        this.f17941c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17939a) {
            case 0:
                this.f17940b.lambda$loadPeerSettings$78(this.d, this.f17941c);
                return;
            default:
                this.f17940b.lambda$deleteUserPhoto$113(this.f17941c, this.d);
                return;
        }
    }

    public bc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f17940b = messagesController;
        this.f17941c = tLObject;
        this.d = j10;
    }
}
