package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc implements Runnable {
    public final int f15973a;
    public final MessagesController f15974b;
    public final TLRPC.User f15975c;

    public bc(MessagesController messagesController, TLRPC.User user, int i10) {
        this.f15973a = i10;
        this.f15974b = messagesController;
        this.f15975c = user;
    }

    @Override
    public final void run() {
        switch (this.f15973a) {
            case 0:
                this.f15974b.lambda$loadFullUser$71(this.f15975c);
                return;
            default:
                this.f15974b.lambda$processUpdateArray$408(this.f15975c);
                return;
        }
    }
}
