package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc implements Runnable {
    public final int f17054a;
    public final MessagesController f17055b;
    public final TLRPC.User f17056c;

    public dc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17054a = i10;
        this.f17055b = messagesController;
        this.f17056c = user;
    }

    @Override
    public final void run() {
        switch (this.f17054a) {
            case 0:
                this.f17055b.lambda$loadFullUser$71(this.f17056c);
                return;
            default:
                this.f17055b.lambda$processUpdateArray$408(this.f17056c);
                return;
        }
    }
}
