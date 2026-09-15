package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15750a;
    public final MessagesController f15751b;
    public final TLRPC.User f15752c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15750a = i10;
        this.f15751b = messagesController;
        this.f15752c = user;
    }

    @Override
    public final void run() {
        switch (this.f15750a) {
            case 0:
                this.f15751b.lambda$loadFullUser$71(this.f15752c);
                return;
            default:
                this.f15751b.lambda$processUpdateArray$408(this.f15752c);
                return;
        }
    }
}
