package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ac implements Runnable {
    public final int f17165a;
    public final MessagesController f17166b;
    public final TLRPC.User f17167c;

    public ac(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17165a = i10;
        this.f17166b = messagesController;
        this.f17167c = user;
    }

    @Override
    public final void run() {
        switch (this.f17165a) {
            case 0:
                this.f17166b.lambda$loadFullUser$71(this.f17167c);
                return;
            default:
                this.f17166b.lambda$processUpdateArray$408(this.f17167c);
                return;
        }
    }
}
