package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15988a;
    public final MessagesController f15989b;
    public final TLRPC.User f15990c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15988a = i10;
        this.f15989b = messagesController;
        this.f15990c = user;
    }

    @Override
    public final void run() {
        switch (this.f15988a) {
            case 0:
                this.f15989b.lambda$loadFullUser$71(this.f15990c);
                return;
            default:
                this.f15989b.lambda$processUpdateArray$408(this.f15990c);
                return;
        }
    }
}
