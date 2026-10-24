package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f19022a;
    public final MessagesController f19023b;
    public final TLRPC.User f19024c;

    public ma(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f19022a = i10;
        this.f19023b = messagesController;
        this.f19024c = user;
    }

    @Override
    public final void run() {
        switch (this.f19022a) {
            case 0:
                this.f19023b.lambda$processUpdateArray$411(this.f19024c);
                return;
            default:
                this.f19023b.lambda$loadFullUser$70(this.f19024c);
                return;
        }
    }
}
