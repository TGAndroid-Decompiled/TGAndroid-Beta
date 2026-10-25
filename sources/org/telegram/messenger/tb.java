package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f21325a;
    public final MessagesController f21326b;
    public final TLRPC.User f21327c;

    public tb(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f21325a = i10;
        this.f21326b = messagesController;
        this.f21327c = user;
    }

    @Override
    public final void run() {
        switch (this.f21325a) {
            case 0:
                this.f21326b.lambda$loadFullUser$70(this.f21327c);
                return;
            default:
                this.f21326b.lambda$processUpdateArray$413(this.f21327c);
                return;
        }
    }
}
