package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f22014a;
    public final MessagesController f22015b;
    public final TLRPC.User f22016c;

    public wb(MessagesController messagesController, TLRPC.User user, int i9) {
        this.f22014a = i9;
        this.f22015b = messagesController;
        this.f22016c = user;
    }

    @Override
    public final void run() {
        switch (this.f22014a) {
            case 0:
                this.f22015b.lambda$loadFullUser$71(this.f22016c);
                return;
            default:
                this.f22015b.lambda$processUpdateArray$408(this.f22016c);
                return;
        }
    }
}
