package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18589a;
    public final MessagesController f18590b;
    public final TLRPC.User f18591c;

    public ia(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18589a = i10;
        this.f18590b = messagesController;
        this.f18591c = user;
    }

    @Override
    public final void run() {
        switch (this.f18589a) {
            case 0:
                this.f18590b.lambda$processUpdateArray$411(this.f18591c);
                return;
            default:
                this.f18590b.lambda$loadFullUser$70(this.f18591c);
                return;
        }
    }
}
