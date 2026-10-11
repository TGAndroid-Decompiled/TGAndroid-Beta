package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class dc implements Runnable {
    public final int f17645a = 0;
    public final MessagesController f17646b;
    public final TLObject f17647c;
    public final long d;

    public dc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17646b = messagesController;
        this.d = j3;
        this.f17647c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17645a) {
            case 0:
                this.f17646b.lambda$loadPeerSettings$78(this.d, this.f17647c);
                return;
            default:
                this.f17646b.lambda$deleteUserPhoto$113(this.f17647c, this.d);
                return;
        }
    }

    public dc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17646b = messagesController;
        this.f17647c = tLObject;
        this.d = j3;
    }
}
