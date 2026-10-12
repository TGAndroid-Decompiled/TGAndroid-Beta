package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f17770a;
    public final MessagesController f17771b;
    public final TLRPC.User f17772c;

    public la(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17770a = i10;
        this.f17771b = messagesController;
        this.f17772c = user;
    }

    @Override
    public final void run() {
        switch (this.f17770a) {
            case 0:
                this.f17771b.lambda$processUpdateArray$411(this.f17772c);
                return;
            default:
                this.f17771b.lambda$loadFullUser$70(this.f17772c);
                return;
        }
    }
}
