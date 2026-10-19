package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18592a;
    public final MessagesController f18593b;
    public final TLRPC.User f18594c;

    public ia(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18592a = i10;
        this.f18593b = messagesController;
        this.f18594c = user;
    }

    @Override
    public final void run() {
        switch (this.f18592a) {
            case 0:
                this.f18593b.lambda$processUpdateArray$411(this.f18594c);
                return;
            default:
                this.f18593b.lambda$loadFullUser$70(this.f18594c);
                return;
        }
    }
}
