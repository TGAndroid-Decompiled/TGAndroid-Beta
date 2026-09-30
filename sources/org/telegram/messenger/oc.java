package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17211a = 1;
    public final MessagesController f17212b;
    public final long f17213c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17212b = messagesController;
        this.f17213c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17211a) {
            case 0:
                this.f17212b.lambda$deleteUserPhoto$114(this.d, this.f17213c);
                return;
            default:
                this.f17212b.lambda$loadPeerSettings$79(this.f17213c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17212b = messagesController;
        this.d = tLObject;
        this.f17213c = j3;
    }
}
