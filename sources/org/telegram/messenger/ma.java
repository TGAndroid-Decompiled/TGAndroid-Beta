package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f18956a;
    public final MessagesController f18957b;
    public final TLRPC.User f18958c;

    public ma(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18956a = i10;
        this.f18957b = messagesController;
        this.f18958c = user;
    }

    @Override
    public final void run() {
        switch (this.f18956a) {
            case 0:
                this.f18957b.lambda$processUpdateArray$411(this.f18958c);
                return;
            default:
                this.f18957b.lambda$loadFullUser$70(this.f18958c);
                return;
        }
    }
}
