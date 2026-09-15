package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f16934a = 1;
    public final MessagesController f16935b;
    public final long f16936c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f16935b = messagesController;
        this.f16936c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16934a) {
            case 0:
                this.f16935b.lambda$deleteUserPhoto$114(this.d, this.f16936c);
                return;
            default:
                this.f16935b.lambda$loadPeerSettings$79(this.f16936c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f16935b = messagesController;
        this.d = tLObject;
        this.f16936c = j3;
    }
}
