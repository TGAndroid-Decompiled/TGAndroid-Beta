package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class gc implements Runnable {
    public final int f17680a = 0;
    public final MessagesController f17681b;
    public final TLObject f17682c;
    public final long d;

    public gc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f17681b = messagesController;
        this.d = j3;
        this.f17682c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17680a) {
            case 0:
                this.f17681b.lambda$loadPeerSettings$78(this.d, this.f17682c);
                return;
            default:
                this.f17681b.lambda$deleteUserPhoto$113(this.f17682c, this.d);
                return;
        }
    }

    public gc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f17681b = messagesController;
        this.f17682c = tLObject;
        this.d = j3;
    }
}
