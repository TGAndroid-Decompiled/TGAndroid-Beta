package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class jc implements Runnable {
    public final int f20690a = 1;
    public final MessagesController f20691b;
    public final long f20692c;
    public final TLObject d;

    public jc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f20691b = messagesController;
        this.f20692c = j10;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20690a) {
            case 0:
                this.f20691b.lambda$deleteUserPhoto$114(this.d, this.f20692c);
                return;
            default:
                this.f20691b.lambda$loadPeerSettings$79(this.f20692c, this.d);
                return;
        }
    }

    public jc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f20691b = messagesController;
        this.d = tLObject;
        this.f20692c = j10;
    }
}
