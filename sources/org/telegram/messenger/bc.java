package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f16007a;
    public final MessagesController f16008b;
    public final TLRPC.User f16009c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f16007a = i10;
        this.f16008b = messagesController;
        this.f16009c = user;
    }

    @Override
    public final void run() {
        switch (this.f16007a) {
            case 0:
                this.f16008b.lambda$loadFullUser$71(this.f16009c);
                return;
            default:
                this.f16008b.lambda$processUpdateArray$408(this.f16009c);
                return;
        }
    }
}
