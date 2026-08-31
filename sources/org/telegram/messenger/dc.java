package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc implements Runnable {
    public final int f18485a;
    public final MessagesController f18486b;
    public final TLRPC.User f18487c;

    public dc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18485a = i10;
        this.f18486b = messagesController;
        this.f18487c = user;
    }

    @Override
    public final void run() {
        switch (this.f18485a) {
            case 0:
                this.f18486b.lambda$loadFullUser$71(this.f18487c);
                return;
            default:
                this.f18486b.lambda$processUpdateArray$408(this.f18487c);
                return;
        }
    }
}
