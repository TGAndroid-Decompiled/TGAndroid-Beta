package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f18774a = 1;
    public final MessagesController f18775b;
    public final long f18776c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f18775b = messagesController;
        this.f18776c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18774a) {
            case 0:
                this.f18775b.lambda$deleteUserPhoto$114(this.d, this.f18776c);
                return;
            default:
                this.f18775b.lambda$loadPeerSettings$79(this.f18776c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f18775b = messagesController;
        this.d = tLObject;
        this.f18776c = j3;
    }
}
