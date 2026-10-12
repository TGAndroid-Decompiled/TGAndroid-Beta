package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f18168a;
    public final MessagesController f18169b;
    public final TLRPC.User f18170c;

    public la(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18168a = i10;
        this.f18169b = messagesController;
        this.f18170c = user;
    }

    @Override
    public final void run() {
        switch (this.f18168a) {
            case 0:
                this.f18169b.lambda$processUpdateArray$411(this.f18170c);
                return;
            default:
                this.f18169b.lambda$loadFullUser$70(this.f18170c);
                return;
        }
    }
}
