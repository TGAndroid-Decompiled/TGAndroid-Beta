package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15991a;
    public final MessagesController f15992b;
    public final TLRPC.User f15993c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15991a = i10;
        this.f15992b = messagesController;
        this.f15993c = user;
    }

    @Override
    public final void run() {
        switch (this.f15991a) {
            case 0:
                this.f15992b.lambda$loadFullUser$71(this.f15993c);
                return;
            default:
                this.f15992b.lambda$processUpdateArray$408(this.f15993c);
                return;
        }
    }
}
