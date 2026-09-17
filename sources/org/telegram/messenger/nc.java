package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class nc implements Runnable {
    public final int f18487a = 1;
    public final MessagesController f18488b;
    public final long f18489c;
    public final TLObject d;

    public nc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f18488b = messagesController;
        this.f18489c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18487a) {
            case 0:
                this.f18488b.lambda$deleteUserPhoto$114(this.d, this.f18489c);
                return;
            default:
                this.f18488b.lambda$loadPeerSettings$79(this.f18489c, this.d);
                return;
        }
    }

    public nc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f18488b = messagesController;
        this.d = tLObject;
        this.f18489c = j3;
    }
}
