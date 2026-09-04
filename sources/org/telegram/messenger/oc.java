package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f18564a = 1;
    public final MessagesController f18565b;
    public final long f18566c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f18565b = messagesController;
        this.f18566c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18564a) {
            case 0:
                this.f18565b.lambda$deleteUserPhoto$114(this.d, this.f18566c);
                return;
            default:
                this.f18565b.lambda$loadPeerSettings$79(this.f18566c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f18565b = messagesController;
        this.d = tLObject;
        this.f18566c = j3;
    }
}
