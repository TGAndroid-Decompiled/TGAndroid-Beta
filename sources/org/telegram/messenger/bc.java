package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class bc implements Runnable {
    public final int f17952a = 0;
    public final MessagesController f17953b;
    public final TLObject f17954c;
    public final long d;

    public bc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f17953b = messagesController;
        this.d = j10;
        this.f17954c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17952a) {
            case 0:
                this.f17953b.lambda$loadPeerSettings$78(this.d, this.f17954c);
                return;
            default:
                this.f17953b.lambda$deleteUserPhoto$113(this.f17954c, this.d);
                return;
        }
    }

    public bc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f17953b = messagesController;
        this.f17954c = tLObject;
        this.d = j10;
    }
}
