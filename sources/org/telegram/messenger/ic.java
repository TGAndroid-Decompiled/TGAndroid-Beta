package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ic implements Runnable {
    public final int f15455a;
    public final MessagesController f15456b;
    public final TLRPC.User f15457c;

    public ic(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15455a = i10;
        this.f15456b = messagesController;
        this.f15457c = user;
    }

    @Override
    public final void run() {
        switch (this.f15455a) {
            case 0:
                this.f15456b.lambda$loadFullUser$71(this.f15457c);
                return;
            default:
                this.f15456b.lambda$processUpdateArray$408(this.f15457c);
                return;
        }
    }
}
