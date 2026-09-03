package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qc implements Runnable {
    public final int f19778a = 1;
    public final MessagesController f19779b;
    public final long f19780c;
    public final TLObject d;

    public qc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f19779b = messagesController;
        this.f19780c = j10;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19778a) {
            case 0:
                this.f19779b.lambda$deleteUserPhoto$114(this.d, this.f19780c);
                return;
            default:
                this.f19779b.lambda$loadPeerSettings$79(this.f19780c, this.d);
                return;
        }
    }

    public qc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f19779b = messagesController;
        this.d = tLObject;
        this.f19780c = j10;
    }
}
