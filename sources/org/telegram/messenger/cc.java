package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class cc implements Runnable {
    public final int f18083a = 0;
    public final MessagesController f18084b;
    public final TLObject f18085c;
    public final long d;

    public cc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18084b = messagesController;
        this.d = j10;
        this.f18085c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18083a) {
            case 0:
                this.f18084b.lambda$loadPeerSettings$78(this.d, this.f18085c);
                return;
            default:
                this.f18084b.lambda$deleteUserPhoto$113(this.f18085c, this.d);
                return;
        }
    }

    public cc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18084b = messagesController;
        this.f18085c = tLObject;
        this.d = j10;
    }
}
