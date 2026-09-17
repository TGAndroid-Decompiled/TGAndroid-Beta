package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class nc implements Runnable {
    public final int f18514a = 1;
    public final MessagesController f18515b;
    public final long f18516c;
    public final TLObject d;

    public nc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.f18515b = messagesController;
        this.f18516c = j3;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18514a) {
            case 0:
                this.f18515b.lambda$deleteUserPhoto$114(this.d, this.f18516c);
                return;
            default:
                this.f18515b.lambda$loadPeerSettings$79(this.f18516c, this.d);
                return;
        }
    }

    public nc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.f18515b = messagesController;
        this.d = tLObject;
        this.f18516c = j3;
    }
}
