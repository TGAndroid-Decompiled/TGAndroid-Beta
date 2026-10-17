package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ha implements Runnable {
    public final int f18516a;
    public final MessagesController f18517b;
    public final TLRPC.User f18518c;

    public ha(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18516a = i10;
        this.f18517b = messagesController;
        this.f18518c = user;
    }

    @Override
    public final void run() {
        switch (this.f18516a) {
            case 0:
                this.f18517b.lambda$processUpdateArray$411(this.f18518c);
                return;
            default:
                this.f18517b.lambda$loadFullUser$70(this.f18518c);
                return;
        }
    }
}
