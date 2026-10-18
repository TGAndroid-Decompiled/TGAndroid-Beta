package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ha implements Runnable {
    public final int f18515a;
    public final MessagesController f18516b;
    public final TLRPC.User f18517c;

    public ha(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18515a = i10;
        this.f18516b = messagesController;
        this.f18517c = user;
    }

    @Override
    public final void run() {
        switch (this.f18515a) {
            case 0:
                this.f18516b.lambda$processUpdateArray$411(this.f18517c);
                return;
            default:
                this.f18516b.lambda$loadFullUser$70(this.f18517c);
                return;
        }
    }
}
