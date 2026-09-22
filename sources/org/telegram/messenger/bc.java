package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15748a;
    public final MessagesController f15749b;
    public final TLRPC.User f15750c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15748a = i10;
        this.f15749b = messagesController;
        this.f15750c = user;
    }

    @Override
    public final void run() {
        switch (this.f15748a) {
            case 0:
                this.f15749b.lambda$loadFullUser$71(this.f15750c);
                return;
            default:
                this.f15749b.lambda$processUpdateArray$408(this.f15750c);
                return;
        }
    }
}
