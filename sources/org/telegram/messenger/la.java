package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f18169a;
    public final MessagesController f18170b;
    public final TLRPC.User f18171c;

    public la(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18169a = i10;
        this.f18170b = messagesController;
        this.f18171c = user;
    }

    @Override
    public final void run() {
        switch (this.f18169a) {
            case 0:
                this.f18170b.lambda$processUpdateArray$411(this.f18171c);
                return;
            default:
                this.f18170b.lambda$loadFullUser$70(this.f18171c);
                return;
        }
    }
}
