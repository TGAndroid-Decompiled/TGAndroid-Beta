package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc implements Runnable {
    public final int f18487a;
    public final MessagesController f18488b;
    public final TLRPC.User f18489c;

    public dc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f18487a = i10;
        this.f18488b = messagesController;
        this.f18489c = user;
    }

    @Override
    public final void run() {
        switch (this.f18487a) {
            case 0:
                this.f18488b.lambda$loadFullUser$71(this.f18489c);
                return;
            default:
                this.f18488b.lambda$processUpdateArray$408(this.f18489c);
                return;
        }
    }
}
