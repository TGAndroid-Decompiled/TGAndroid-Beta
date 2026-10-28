package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class hc implements Runnable {
    public final int f20242a = 0;
    public final MessagesController f20243b;
    public final TLObject f20244c;
    public final long d;

    public hc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f20243b = messagesController;
        this.d = j10;
        this.f20244c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20242a) {
            case 0:
                this.f20243b.lambda$loadPeerSettings$78(this.d, this.f20244c);
                return;
            default:
                this.f20243b.lambda$deleteUserPhoto$113(this.f20244c, this.d);
                return;
        }
    }

    public hc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f20243b = messagesController;
        this.f20244c = tLObject;
        this.d = j10;
    }
}
