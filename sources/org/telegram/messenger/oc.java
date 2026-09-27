package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17184a = 1;
    public final MessagesController f17185b;
    public final long f17186c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17185b = messagesController;
        this.f17186c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17184a) {
            case 0:
                this.f17185b.lambda$deleteUserPhoto$114(this.d, this.f17186c);
                return;
            default:
                this.f17185b.lambda$loadPeerSettings$79(this.f17186c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17185b = messagesController;
        this.d = tLObject;
        this.f17186c = j3;
    }
}
