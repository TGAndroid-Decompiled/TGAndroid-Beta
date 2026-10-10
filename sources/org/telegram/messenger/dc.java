package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class dc implements Runnable {
    public final int f17649a = 0;
    public final MessagesController f17650b;
    public final TLObject f17651c;
    public final long d;

    public dc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17650b = messagesController;
        this.d = j3;
        this.f17651c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17649a) {
            case 0:
                this.f17650b.lambda$loadPeerSettings$78(this.d, this.f17651c);
                return;
            default:
                this.f17650b.lambda$deleteUserPhoto$113(this.f17651c, this.d);
                return;
        }
    }

    public dc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17650b = messagesController;
        this.f17651c = tLObject;
        this.d = j3;
    }
}
