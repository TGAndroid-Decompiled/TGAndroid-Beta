package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18141a;
    public final MessagesController f18142b;
    public final TLRPC.User f18143c;

    public ia(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18141a = i10;
        this.f18142b = messagesController;
        this.f18143c = user;
    }

    @Override
    public final void run() {
        switch (this.f18141a) {
            case 0:
                this.f18142b.lambda$processUpdateArray$411(this.f18143c);
                return;
            default:
                this.f18142b.lambda$loadFullUser$70(this.f18143c);
                return;
        }
    }
}
