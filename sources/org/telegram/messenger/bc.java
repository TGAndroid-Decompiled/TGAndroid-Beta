package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15984a;
    public final MessagesController f15985b;
    public final TLRPC.User f15986c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15984a = i10;
        this.f15985b = messagesController;
        this.f15986c = user;
    }

    @Override
    public final void run() {
        switch (this.f15984a) {
            case 0:
                this.f15985b.lambda$loadFullUser$71(this.f15986c);
                return;
            default:
                this.f15985b.lambda$processUpdateArray$408(this.f15986c);
                return;
        }
    }
}
