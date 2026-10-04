package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f17429a;
    public final MessagesController f17430b;
    public final TLRPC.User f17431c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17429a = i10;
        this.f17430b = messagesController;
        this.f17431c = user;
    }

    @Override
    public final void run() {
        switch (this.f17429a) {
            case 0:
                this.f17430b.lambda$loadFullUser$71(this.f17431c);
                return;
            default:
                this.f17430b.lambda$processUpdateArray$408(this.f17431c);
                return;
        }
    }
}
