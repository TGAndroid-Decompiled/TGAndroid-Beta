package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qc implements Runnable {
    public final int f18215a = 1;
    public final MessagesController f18216b;
    public final long f18217c;
    public final TLObject d;

    public qc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18216b = messagesController;
        this.f18217c = j10;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18215a) {
            case 0:
                this.f18216b.lambda$deleteUserPhoto$114(this.d, this.f18217c);
                return;
            default:
                this.f18216b.lambda$loadPeerSettings$79(this.f18217c, this.d);
                return;
        }
    }

    public qc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18216b = messagesController;
        this.d = tLObject;
        this.f18217c = j10;
    }
}
