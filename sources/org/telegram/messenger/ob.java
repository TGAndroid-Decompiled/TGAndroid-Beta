package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ob implements Runnable {
    public final int f17989a;
    public final MessagesController f17990b;
    public final TLRPC.TL_error f17991c;
    public final long d;

    public ob(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f17989a = i10;
        this.f17990b = messagesController;
        this.f17991c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17989a) {
            case 0:
                this.f17990b.lambda$loadFullChat$68(this.f17991c, this.d);
                return;
            default:
                this.f17990b.lambda$getChannelDifference$348(this.f17991c, this.d);
                return;
        }
    }
}
