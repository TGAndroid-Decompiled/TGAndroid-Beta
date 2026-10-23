package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f18880a;
    public final MessagesController f18881b;
    public final TLRPC.User f18882c;

    public la(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18880a = i10;
        this.f18881b = messagesController;
        this.f18882c = user;
    }

    @Override
    public final void run() {
        switch (this.f18880a) {
            case 0:
                this.f18881b.lambda$processUpdateArray$411(this.f18882c);
                return;
            default:
                this.f18881b.lambda$loadFullUser$70(this.f18882c);
                return;
        }
    }
}
