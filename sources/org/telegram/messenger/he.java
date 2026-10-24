package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f18593a;
    public final MessagesController f18594b;
    public final TLRPC.TL_error f18595c;
    public final long d;

    public he(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18593a = i10;
        this.f18594b = messagesController;
        this.f18595c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18593a) {
            case 0:
                this.f18594b.lambda$loadFullChat$67(this.f18595c, this.d);
                return;
            default:
                this.f18594b.lambda$getChannelDifference$347(this.f18595c, this.d);
                return;
        }
    }
}
