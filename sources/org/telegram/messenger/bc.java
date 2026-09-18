package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15937a;
    public final MessagesController f15938b;
    public final TLRPC.User f15939c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15937a = i10;
        this.f15938b = messagesController;
        this.f15939c = user;
    }

    @Override
    public final void run() {
        switch (this.f15937a) {
            case 0:
                this.f15938b.lambda$loadFullUser$71(this.f15939c);
                return;
            default:
                this.f15938b.lambda$processUpdateArray$408(this.f15939c);
                return;
        }
    }
}
