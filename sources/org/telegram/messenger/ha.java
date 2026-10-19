package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ha implements Runnable {
    public final int f18512a;
    public final MessagesController f18513b;
    public final TLRPC.User f18514c;

    public ha(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18512a = i10;
        this.f18513b = messagesController;
        this.f18514c = user;
    }

    @Override
    public final void run() {
        switch (this.f18512a) {
            case 0:
                this.f18513b.lambda$processUpdateArray$411(this.f18514c);
                return;
            default:
                this.f18513b.lambda$loadFullUser$70(this.f18514c);
                return;
        }
    }
}
