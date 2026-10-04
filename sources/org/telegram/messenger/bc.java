package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f17430a;
    public final MessagesController f17431b;
    public final TLRPC.User f17432c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17430a = i10;
        this.f17431b = messagesController;
        this.f17432c = user;
    }

    @Override
    public final void run() {
        switch (this.f17430a) {
            case 0:
                this.f17431b.lambda$loadFullUser$71(this.f17432c);
                return;
            default:
                this.f17431b.lambda$processUpdateArray$408(this.f17432c);
                return;
        }
    }
}
