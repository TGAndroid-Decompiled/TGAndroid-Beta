package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ic implements Runnable {
    public final int f20334a = 0;
    public final MessagesController f20335b;
    public final TLObject f20336c;
    public final long d;

    public ic(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f20335b = messagesController;
        this.d = j10;
        this.f20336c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20334a) {
            case 0:
                this.f20335b.lambda$loadPeerSettings$78(this.d, this.f20336c);
                return;
            default:
                this.f20335b.lambda$deleteUserPhoto$113(this.f20336c, this.d);
                return;
        }
    }

    public ic(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f20335b = messagesController;
        this.f20336c = tLObject;
        this.d = j10;
    }
}
