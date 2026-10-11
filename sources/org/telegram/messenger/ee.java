package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ee implements Runnable {
    public final int f17794a;
    public final MessagesController f17795b;
    public final TLRPC.TL_error f17796c;
    public final long d;

    public ee(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17794a = i10;
        this.f17795b = messagesController;
        this.f17796c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17794a) {
            case 0:
                this.f17795b.lambda$loadFullChat$67(this.f17796c, this.d);
                return;
            default:
                this.f17795b.lambda$getChannelDifference$347(this.f17796c, this.d);
                return;
        }
    }
}
