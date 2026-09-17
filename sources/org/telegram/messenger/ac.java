package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ac implements Runnable {
    public final int f17192a;
    public final MessagesController f17193b;
    public final TLRPC.User f17194c;

    public ac(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f17192a = i10;
        this.f17193b = messagesController;
        this.f17194c = user;
    }

    @Override
    public final void run() {
        switch (this.f17192a) {
            case 0:
                this.f17193b.lambda$loadFullUser$71(this.f17194c);
                return;
            default:
                this.f17193b.lambda$processUpdateArray$408(this.f17194c);
                return;
        }
    }
}
