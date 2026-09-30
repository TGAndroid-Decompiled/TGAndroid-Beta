package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f17195a = 1;
    public final MessagesController f17196b;
    public final long f17197c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17196b = messagesController;
        this.f17197c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17195a) {
            case 0:
                this.f17196b.lambda$deleteUserPhoto$114(this.d, this.f17197c);
                return;
            default:
                this.f17196b.lambda$loadPeerSettings$79(this.f17197c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17196b = messagesController;
        this.d = tLObject;
        this.f17197c = j3;
    }
}
