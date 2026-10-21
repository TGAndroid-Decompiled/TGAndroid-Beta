package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f18679a;
    public final MessagesController f18680b;
    public final TLRPC.User f18681c;

    public ja(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18679a = i10;
        this.f18680b = messagesController;
        this.f18681c = user;
    }

    @Override
    public final void run() {
        switch (this.f18679a) {
            case 0:
                this.f18680b.lambda$processUpdateArray$411(this.f18681c);
                return;
            default:
                this.f18680b.lambda$loadFullUser$70(this.f18681c);
                return;
        }
    }
}
