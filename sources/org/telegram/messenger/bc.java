package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f17242a;
    public final MessagesController f17243b;
    public final TLRPC.User f17244c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17242a = i10;
        this.f17243b = messagesController;
        this.f17244c = user;
    }

    @Override
    public final void run() {
        switch (this.f17242a) {
            case 0:
                this.f17243b.lambda$loadFullUser$71(this.f17244c);
                return;
            default:
                this.f17243b.lambda$processUpdateArray$408(this.f17244c);
                return;
        }
    }
}
