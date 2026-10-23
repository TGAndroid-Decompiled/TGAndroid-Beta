package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f18517a;
    public final MessagesController f18518b;
    public final TLRPC.TL_error f18519c;
    public final long d;

    public ge(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18517a = i10;
        this.f18518b = messagesController;
        this.f18519c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18517a) {
            case 0:
                this.f18518b.lambda$loadFullChat$67(this.f18519c, this.d);
                return;
            default:
                this.f18518b.lambda$getChannelDifference$347(this.f18519c, this.d);
                return;
        }
    }
}
