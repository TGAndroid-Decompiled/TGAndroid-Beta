package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f17473a;
    public final MessagesController f17474b;
    public final TLRPC.User f17475c;

    public la(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17473a = i10;
        this.f17474b = messagesController;
        this.f17475c = user;
    }

    @Override
    public final void run() {
        switch (this.f17473a) {
            case 0:
                this.f17474b.lambda$processUpdateArray$411(this.f17475c);
                return;
            default:
                this.f17474b.lambda$loadFullUser$70(this.f17475c);
                return;
        }
    }
}
