package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f18948a;
    public final MessagesController f18949b;
    public final TLRPC.User f18950c;

    public la(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18948a = i10;
        this.f18949b = messagesController;
        this.f18950c = user;
    }

    @Override
    public final void run() {
        switch (this.f18948a) {
            case 0:
                this.f18949b.lambda$processUpdateArray$411(this.f18950c);
                return;
            default:
                this.f18949b.lambda$loadFullUser$70(this.f18950c);
                return;
        }
    }
}
