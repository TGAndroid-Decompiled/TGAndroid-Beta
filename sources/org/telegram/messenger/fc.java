package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class fc implements Runnable {
    public final int f18423a = 0;
    public final MessagesController f18424b;
    public final TLObject f18425c;
    public final long d;

    public fc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18424b = messagesController;
        this.d = j10;
        this.f18425c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18423a) {
            case 0:
                this.f18424b.lambda$loadPeerSettings$78(this.d, this.f18425c);
                return;
            default:
                this.f18424b.lambda$deleteUserPhoto$113(this.f18425c, this.d);
                return;
        }
    }

    public fc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18424b = messagesController;
        this.f18425c = tLObject;
        this.d = j10;
    }
}
