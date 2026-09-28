package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17194a = 1;
    public final MessagesController f17195b;
    public final long f17196c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17195b = messagesController;
        this.f17196c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17194a) {
            case 0:
                this.f17195b.lambda$deleteUserPhoto$114(this.d, this.f17196c);
                return;
            default:
                this.f17195b.lambda$loadPeerSettings$79(this.f17196c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17195b = messagesController;
        this.d = tLObject;
        this.f17196c = j3;
    }
}
