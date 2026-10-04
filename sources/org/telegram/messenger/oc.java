package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class oc implements Runnable {
    public final int f18771a = 1;
    public final MessagesController f18772b;
    public final long f18773c;
    public final TLObject d;

    public oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f18772b = messagesController;
        this.f18773c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18771a) {
            case 0:
                this.f18772b.lambda$deleteUserPhoto$114(this.d, this.f18773c);
                return;
            default:
                this.f18772b.lambda$loadPeerSettings$79(this.f18773c, this.d);
                return;
        }
    }

    public oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f18772b = messagesController;
        this.d = tLObject;
        this.f18773c = j3;
    }
}
