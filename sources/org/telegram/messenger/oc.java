package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f16939a = 1;
    public final MessagesController f16940b;
    public final long f16941c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f16940b = messagesController;
        this.f16941c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16939a) {
            case 0:
                this.f16940b.lambda$deleteUserPhoto$114(this.d, this.f16941c);
                return;
            default:
                this.f16940b.lambda$loadPeerSettings$79(this.f16941c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f16940b = messagesController;
        this.d = tLObject;
        this.f16941c = j3;
    }
}
