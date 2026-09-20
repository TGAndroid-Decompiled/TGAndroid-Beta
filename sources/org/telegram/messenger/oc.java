package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17157a = 1;
    public final MessagesController f17158b;
    public final long f17159c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17158b = messagesController;
        this.f17159c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17157a) {
            case 0:
                this.f17158b.lambda$deleteUserPhoto$114(this.d, this.f17159c);
                return;
            default:
                this.f17158b.lambda$loadPeerSettings$79(this.f17159c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17158b = messagesController;
        this.d = tLObject;
        this.f17159c = j3;
    }
}
