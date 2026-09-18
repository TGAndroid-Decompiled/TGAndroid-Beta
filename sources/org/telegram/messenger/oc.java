package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f16943a = 1;
    public final MessagesController f16944b;
    public final long f16945c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f16944b = messagesController;
        this.f16945c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16943a) {
            case 0:
                this.f16944b.lambda$deleteUserPhoto$114(this.d, this.f16945c);
                return;
            default:
                this.f16944b.lambda$loadPeerSettings$79(this.f16945c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f16944b = messagesController;
        this.d = tLObject;
        this.f16945c = j3;
    }
}
