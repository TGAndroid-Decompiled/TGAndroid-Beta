package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ce implements Runnable {
    public final int f18103a;
    public final MessagesController f18104b;
    public final TLRPC.TL_error f18105c;
    public final long d;

    public ce(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18103a = i10;
        this.f18104b = messagesController;
        this.f18105c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18103a) {
            case 0:
                this.f18104b.lambda$loadFullChat$67(this.f18105c, this.d);
                return;
            default:
                this.f18104b.lambda$getChannelDifference$347(this.f18105c, this.d);
                return;
        }
    }
}
