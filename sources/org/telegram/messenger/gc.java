package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class gc implements Runnable {
    public final int f18429a = 0;
    public final MessagesController f18430b;
    public final TLObject f18431c;
    public final long d;

    public gc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18430b = messagesController;
        this.d = j10;
        this.f18431c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18429a) {
            case 0:
                this.f18430b.lambda$loadPeerSettings$78(this.d, this.f18431c);
                return;
            default:
                this.f18430b.lambda$deleteUserPhoto$113(this.f18431c, this.d);
                return;
        }
    }

    public gc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18430b = messagesController;
        this.f18431c = tLObject;
        this.d = j10;
    }
}
