package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class pc implements Runnable {
    public final int f21253a = 1;
    public final MessagesController f21254b;
    public final long f21255c;
    public final TLObject d;

    public pc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f21254b = messagesController;
        this.f21255c = j10;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21253a) {
            case 0:
                this.f21254b.lambda$deleteUserPhoto$114(this.d, this.f21255c);
                return;
            default:
                this.f21254b.lambda$loadPeerSettings$79(this.f21255c, this.d);
                return;
        }
    }

    public pc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f21254b = messagesController;
        this.d = tLObject;
        this.f21255c = j10;
    }
}
