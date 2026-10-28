package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f20422a;
    public final MessagesController f20423b;
    public final TLRPC.User f20424c;

    public ja(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f20422a = i10;
        this.f20423b = messagesController;
        this.f20424c = user;
    }

    @Override
    public final void run() {
        switch (this.f20422a) {
            case 0:
                this.f20423b.lambda$processUpdateArray$414(this.f20424c);
                return;
            default:
                this.f20423b.lambda$loadFullUser$70(this.f20424c);
                return;
        }
    }
}
