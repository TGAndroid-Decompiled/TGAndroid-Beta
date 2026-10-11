package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ia implements Runnable {
    public final int f18146a;
    public final MessagesController f18147b;
    public final TLRPC.User f18148c;

    public ia(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18146a = i10;
        this.f18147b = messagesController;
        this.f18148c = user;
    }

    @Override
    public final void run() {
        switch (this.f18146a) {
            case 0:
                this.f18147b.lambda$processUpdateArray$411(this.f18148c);
                return;
            default:
                this.f18147b.lambda$loadFullUser$70(this.f18148c);
                return;
        }
    }
}
