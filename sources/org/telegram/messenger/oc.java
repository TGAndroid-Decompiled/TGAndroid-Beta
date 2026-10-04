package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f18775a = 1;
    public final MessagesController f18776b;
    public final long f18777c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f18776b = messagesController;
        this.f18777c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18775a) {
            case 0:
                this.f18776b.lambda$deleteUserPhoto$114(this.d, this.f18777c);
                return;
            default:
                this.f18776b.lambda$loadPeerSettings$79(this.f18777c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f18776b = messagesController;
        this.d = tLObject;
        this.f18777c = j3;
    }
}
