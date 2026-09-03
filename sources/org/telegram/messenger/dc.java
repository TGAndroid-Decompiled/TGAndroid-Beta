package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc implements Runnable {
    public final int f17037a;
    public final MessagesController f17038b;
    public final TLRPC.User f17039c;

    public dc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17037a = i10;
        this.f17038b = messagesController;
        this.f17039c = user;
    }

    @Override
    public final void run() {
        switch (this.f17037a) {
            case 0:
                this.f17038b.lambda$loadFullUser$71(this.f17039c);
                return;
            default:
                this.f17038b.lambda$processUpdateArray$408(this.f17039c);
                return;
        }
    }
}
