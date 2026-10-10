package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ee implements Runnable {
    public final int f17760a;
    public final MessagesController f17761b;
    public final TLRPC.TL_error f17762c;
    public final long d;

    public ee(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17760a = i10;
        this.f17761b = messagesController;
        this.f17762c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17760a) {
            case 0:
                this.f17761b.lambda$loadFullChat$67(this.f17762c, this.d);
                return;
            default:
                this.f17761b.lambda$getChannelDifference$347(this.f17762c, this.d);
                return;
        }
    }
}
