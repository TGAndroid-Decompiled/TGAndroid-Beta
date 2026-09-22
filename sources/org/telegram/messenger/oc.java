package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f16930a = 1;
    public final MessagesController f16931b;
    public final long f16932c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f16931b = messagesController;
        this.f16932c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16930a) {
            case 0:
                this.f16931b.lambda$deleteUserPhoto$114(this.d, this.f16932c);
                return;
            default:
                this.f16931b.lambda$loadPeerSettings$79(this.f16932c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f16931b = messagesController;
        this.d = tLObject;
        this.f16932c = j3;
    }
}
