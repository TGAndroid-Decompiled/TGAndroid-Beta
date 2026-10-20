package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class dc implements Runnable {
    public final int f18178a = 0;
    public final MessagesController f18179b;
    public final TLObject f18180c;
    public final long d;

    public dc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.f18179b = messagesController;
        this.d = j10;
        this.f18180c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18178a) {
            case 0:
                this.f18179b.lambda$loadPeerSettings$78(this.d, this.f18180c);
                return;
            default:
                this.f18179b.lambda$deleteUserPhoto$113(this.f18180c, this.d);
                return;
        }
    }

    public dc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.f18179b = messagesController;
        this.f18180c = tLObject;
        this.d = j10;
    }
}
