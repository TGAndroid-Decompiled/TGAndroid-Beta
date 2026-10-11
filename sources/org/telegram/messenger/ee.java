package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ee implements Runnable {
    public final int f17758a;
    public final MessagesController f17759b;
    public final TLRPC.TL_error f17760c;
    public final long d;

    public ee(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17758a = i10;
        this.f17759b = messagesController;
        this.f17760c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17758a) {
            case 0:
                this.f17759b.lambda$loadFullChat$67(this.f17760c, this.d);
                return;
            default:
                this.f17759b.lambda$getChannelDifference$347(this.f17760c, this.d);
                return;
        }
    }
}
