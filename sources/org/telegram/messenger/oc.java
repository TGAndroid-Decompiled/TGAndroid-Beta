package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17175a = 1;
    public final MessagesController f17176b;
    public final long f17177c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17176b = messagesController;
        this.f17177c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17175a) {
            case 0:
                this.f17176b.lambda$deleteUserPhoto$114(this.d, this.f17177c);
                return;
            default:
                this.f17176b.lambda$loadPeerSettings$79(this.f17177c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17176b = messagesController;
        this.d = tLObject;
        this.f17177c = j3;
    }
}
