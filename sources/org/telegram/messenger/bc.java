package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f17435a;
    public final MessagesController f17436b;
    public final TLRPC.User f17437c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17435a = i10;
        this.f17436b = messagesController;
        this.f17437c = user;
    }

    @Override
    public final void run() {
        switch (this.f17435a) {
            case 0:
                this.f17436b.lambda$loadFullUser$71(this.f17437c);
                return;
            default:
                this.f17436b.lambda$processUpdateArray$408(this.f17437c);
                return;
        }
    }
}
