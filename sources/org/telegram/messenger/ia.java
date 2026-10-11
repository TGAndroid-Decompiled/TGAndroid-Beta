package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18182a;
    public final MessagesController f18183b;
    public final TLRPC.User f18184c;

    public ia(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18182a = i10;
        this.f18183b = messagesController;
        this.f18184c = user;
    }

    @Override
    public final void run() {
        switch (this.f18182a) {
            case 0:
                this.f18183b.lambda$processUpdateArray$411(this.f18184c);
                return;
            default:
                this.f18183b.lambda$loadFullUser$70(this.f18184c);
                return;
        }
    }
}
