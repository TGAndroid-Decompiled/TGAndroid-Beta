package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class cc implements Runnable {
    public final int f18080a = 0;
    public final MessagesController f18081b;
    public final TLObject f18082c;
    public final long d;

    public cc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18081b = messagesController;
        this.d = j10;
        this.f18082c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18080a) {
            case 0:
                this.f18081b.lambda$loadPeerSettings$78(this.d, this.f18082c);
                return;
            default:
                this.f18081b.lambda$deleteUserPhoto$113(this.f18082c, this.d);
                return;
        }
    }

    public cc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18081b = messagesController;
        this.f18082c = tLObject;
        this.d = j10;
    }
}
