package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f17440a;
    public final MessagesController f17441b;
    public final TLRPC.User f17442c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17440a = i10;
        this.f17441b = messagesController;
        this.f17442c = user;
    }

    @Override
    public final void run() {
        switch (this.f17440a) {
            case 0:
                this.f17441b.lambda$loadFullUser$71(this.f17442c);
                return;
            default:
                this.f17441b.lambda$processUpdateArray$408(this.f17442c);
                return;
        }
    }
}
