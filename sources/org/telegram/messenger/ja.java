package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18681a;
    public final MessagesController f18682b;
    public final TLRPC.User f18683c;

    public ja(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18681a = i10;
        this.f18682b = messagesController;
        this.f18683c = user;
    }

    @Override
    public final void run() {
        switch (this.f18681a) {
            case 0:
                this.f18682b.lambda$processUpdateArray$411(this.f18683c);
                return;
            default:
                this.f18682b.lambda$loadFullUser$70(this.f18683c);
                return;
        }
    }
}
