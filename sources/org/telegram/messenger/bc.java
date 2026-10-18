package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class bc implements Runnable {
    public final int f17955a = 0;
    public final MessagesController f17956b;
    public final TLObject f17957c;
    public final long d;

    public bc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f17956b = messagesController;
        this.d = j10;
        this.f17957c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17955a) {
            case 0:
                this.f17956b.lambda$loadPeerSettings$78(this.d, this.f17957c);
                return;
            default:
                this.f17956b.lambda$deleteUserPhoto$113(this.f17957c, this.d);
                return;
        }
    }

    public bc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f17956b = messagesController;
        this.f17957c = tLObject;
        this.d = j10;
    }
}
