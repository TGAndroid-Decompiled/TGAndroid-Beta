package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class gc implements Runnable {
    public final int f17316a = 0;
    public final MessagesController f17317b;
    public final TLObject f17318c;
    public final long d;

    public gc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f17317b = messagesController;
        this.d = j10;
        this.f17318c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17316a) {
            case 0:
                this.f17317b.lambda$loadPeerSettings$78(this.d, this.f17318c);
                return;
            default:
                this.f17317b.lambda$deleteUserPhoto$113(this.f17318c, this.d);
                return;
        }
    }

    public gc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f17317b = messagesController;
        this.f17318c = tLObject;
        this.d = j10;
    }
}
