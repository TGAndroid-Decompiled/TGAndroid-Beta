package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18145a;
    public final MessagesController f18146b;
    public final TLRPC.User f18147c;

    public ia(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18145a = i10;
        this.f18146b = messagesController;
        this.f18147c = user;
    }

    @Override
    public final void run() {
        switch (this.f18145a) {
            case 0:
                this.f18146b.lambda$processUpdateArray$411(this.f18147c);
                return;
            default:
                this.f18146b.lambda$loadFullUser$70(this.f18147c);
                return;
        }
    }
}
