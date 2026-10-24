package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class gc implements Runnable {
    public final int f18495a = 0;
    public final MessagesController f18496b;
    public final TLObject f18497c;
    public final long d;

    public gc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18496b = messagesController;
        this.d = j10;
        this.f18497c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18495a) {
            case 0:
                this.f18496b.lambda$loadPeerSettings$78(this.d, this.f18497c);
                return;
            default:
                this.f18496b.lambda$deleteUserPhoto$113(this.f18497c, this.d);
                return;
        }
    }

    public gc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18496b = messagesController;
        this.f18497c = tLObject;
        this.d = j10;
    }
}
