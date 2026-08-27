package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class ac implements Runnable {

    public final int f19698a;

    public final MessagesController f19699b;

    public final TLRPC.User f19700c;

    public ac(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f19698a = i10;
        this.f19699b = messagesController;
        this.f19700c = user;
    }

    @Override
    public final void run() {
        switch (this.f19698a) {
            case 0:
                this.f19699b.lambda$loadFullUser$71(this.f19700c);
                break;
            default:
                this.f19699b.lambda$processUpdateArray$408(this.f19700c);
                break;
        }
    }
}
