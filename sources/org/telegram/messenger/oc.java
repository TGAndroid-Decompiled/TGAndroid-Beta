package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17110a = 1;
    public final MessagesController f17111b;
    public final long f17112c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17111b = messagesController;
        this.f17112c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17110a) {
            case 0:
                this.f17111b.lambda$deleteUserPhoto$114(this.d, this.f17112c);
                return;
            default:
                this.f17111b.lambda$loadPeerSettings$79(this.f17112c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17111b = messagesController;
        this.d = tLObject;
        this.f17112c = j3;
    }
}
