package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class fc implements Runnable {
    public final int f18360a = 0;
    public final MessagesController f18361b;
    public final TLObject f18362c;
    public final long d;

    public fc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18361b = messagesController;
        this.d = j10;
        this.f18362c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18360a) {
            case 0:
                this.f18361b.lambda$loadPeerSettings$78(this.d, this.f18362c);
                return;
            default:
                this.f18361b.lambda$deleteUserPhoto$113(this.f18362c, this.d);
                return;
        }
    }

    public fc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18361b = messagesController;
        this.f18362c = tLObject;
        this.d = j10;
    }
}
