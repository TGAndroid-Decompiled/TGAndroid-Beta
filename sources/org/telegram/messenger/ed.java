package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final int f19996a;
    public final MessagesController f19997b;
    public final TLRPC.TL_error f19998c;
    public final long d;

    public ed(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f19996a = i10;
        this.f19997b = messagesController;
        this.f19998c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19996a) {
            case 0:
                this.f19997b.lambda$getChannelDifference$349(this.f19998c, this.d);
                return;
            default:
                this.f19997b.lambda$loadFullChat$67(this.f19998c, this.d);
                return;
        }
    }
}
