package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15990a;
    public final MessagesController f15991b;
    public final TLRPC.User f15992c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15990a = i10;
        this.f15991b = messagesController;
        this.f15992c = user;
    }

    @Override
    public final void run() {
        switch (this.f15990a) {
            case 0:
                this.f15991b.lambda$loadFullUser$71(this.f15992c);
                return;
            default:
                this.f15991b.lambda$processUpdateArray$408(this.f15992c);
                return;
        }
    }
}
