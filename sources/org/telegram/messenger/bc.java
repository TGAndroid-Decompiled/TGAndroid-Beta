package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f17269a;
    public final MessagesController f17270b;
    public final TLRPC.User f17271c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17269a = i10;
        this.f17270b = messagesController;
        this.f17271c = user;
    }

    @Override
    public final void run() {
        switch (this.f17269a) {
            case 0:
                this.f17270b.lambda$loadFullUser$71(this.f17271c);
                return;
            default:
                this.f17270b.lambda$processUpdateArray$408(this.f17271c);
                return;
        }
    }
}
