package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f18451a;
    public final MessagesController f18452b;
    public final TLRPC.TL_error f18453c;
    public final long d;

    public ge(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18451a = i10;
        this.f18452b = messagesController;
        this.f18453c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18451a) {
            case 0:
                this.f18452b.lambda$loadFullChat$67(this.f18453c, this.d);
                return;
            default:
                this.f18452b.lambda$getChannelDifference$347(this.f18453c, this.d);
                return;
        }
    }
}
