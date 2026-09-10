package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class wc implements Runnable {
    public final int f16863a = 1;
    public final MessagesController f16864b;
    public final long f16865c;
    public final TLObject d;

    public wc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f16864b = messagesController;
        this.f16865c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16863a) {
            case 0:
                this.f16864b.lambda$deleteUserPhoto$114(this.d, this.f16865c);
                return;
            default:
                this.f16864b.lambda$loadPeerSettings$79(this.f16865c, this.d);
                return;
        }
    }

    public wc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f16864b = messagesController;
        this.d = tLObject;
        this.f16865c = j3;
    }
}
