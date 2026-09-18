package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15759a;
    public final MessagesController f15760b;
    public final TLRPC.User f15761c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15759a = i10;
        this.f15760b = messagesController;
        this.f15761c = user;
    }

    @Override
    public final void run() {
        switch (this.f15759a) {
            case 0:
                this.f15760b.lambda$loadFullUser$71(this.f15761c);
                return;
            default:
                this.f15760b.lambda$processUpdateArray$408(this.f15761c);
                return;
        }
    }
}
