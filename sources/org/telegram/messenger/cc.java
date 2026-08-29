package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cc implements Runnable {
    public final int f19941a;
    public final MessagesController f19942b;
    public final TLRPC.User f19943c;

    public cc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f19941a = i10;
        this.f19942b = messagesController;
        this.f19943c = user;
    }

    @Override
    public final void run() {
        switch (this.f19941a) {
            case 0:
                this.f19942b.lambda$loadFullUser$71(this.f19943c);
                return;
            default:
                this.f19942b.lambda$processUpdateArray$408(this.f19943c);
                return;
        }
    }
}
