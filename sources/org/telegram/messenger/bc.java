package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15975a;
    public final MessagesController f15976b;
    public final TLRPC.User f15977c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15975a = i10;
        this.f15976b = messagesController;
        this.f15977c = user;
    }

    @Override
    public final void run() {
        switch (this.f15975a) {
            case 0:
                this.f15976b.lambda$loadFullUser$71(this.f15977c);
                return;
            default:
                this.f15976b.lambda$processUpdateArray$408(this.f15977c);
                return;
        }
    }
}
