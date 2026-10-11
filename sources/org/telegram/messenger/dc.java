package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class dc implements Runnable {
    public final int f17681a = 0;
    public final MessagesController f17682b;
    public final TLObject f17683c;
    public final long d;

    public dc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17682b = messagesController;
        this.d = j3;
        this.f17683c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17681a) {
            case 0:
                this.f17682b.lambda$loadPeerSettings$78(this.d, this.f17683c);
                return;
            default:
                this.f17682b.lambda$deleteUserPhoto$113(this.f17683c, this.d);
                return;
        }
    }

    public dc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17682b = messagesController;
        this.f17683c = tLObject;
        this.d = j3;
    }
}
