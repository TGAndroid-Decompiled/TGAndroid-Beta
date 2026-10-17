package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ce implements Runnable {
    public final int f18091a;
    public final MessagesController f18092b;
    public final TLRPC.TL_error f18093c;
    public final long d;

    public ce(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18091a = i10;
        this.f18092b = messagesController;
        this.f18093c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18091a) {
            case 0:
                this.f18092b.lambda$loadFullChat$67(this.f18093c, this.d);
                return;
            default:
                this.f18092b.lambda$getChannelDifference$347(this.f18093c, this.d);
                return;
        }
    }
}
