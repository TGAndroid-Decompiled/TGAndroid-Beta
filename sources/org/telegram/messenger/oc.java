package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f18591a = 1;
    public final MessagesController f18592b;
    public final long f18593c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f18592b = messagesController;
        this.f18593c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18591a) {
            case 0:
                this.f18592b.lambda$deleteUserPhoto$114(this.d, this.f18593c);
                return;
            default:
                this.f18592b.lambda$loadPeerSettings$79(this.f18593c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f18592b = messagesController;
        this.d = tLObject;
        this.f18593c = j3;
    }
}
