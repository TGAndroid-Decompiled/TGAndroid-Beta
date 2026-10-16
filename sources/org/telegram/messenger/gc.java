package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class gc implements Runnable {
    public final int f17012a = 0;
    public final MessagesController f17013b;
    public final TLObject f17014c;
    public final long d;

    public gc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f17013b = messagesController;
        this.d = j10;
        this.f17014c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17012a) {
            case 0:
                this.f17013b.lambda$loadPeerSettings$78(this.d, this.f17014c);
                return;
            default:
                this.f17013b.lambda$deleteUserPhoto$113(this.f17014c, this.d);
                return;
        }
    }

    public gc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f17013b = messagesController;
        this.f17014c = tLObject;
        this.d = j10;
    }
}
