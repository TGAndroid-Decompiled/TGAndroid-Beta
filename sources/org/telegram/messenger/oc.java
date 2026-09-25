package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17190a = 1;
    public final MessagesController f17191b;
    public final long f17192c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17191b = messagesController;
        this.f17192c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17190a) {
            case 0:
                this.f17191b.lambda$deleteUserPhoto$114(this.d, this.f17192c);
                return;
            default:
                this.f17191b.lambda$loadPeerSettings$79(this.f17192c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17191b = messagesController;
        this.d = tLObject;
        this.f17192c = j3;
    }
}
