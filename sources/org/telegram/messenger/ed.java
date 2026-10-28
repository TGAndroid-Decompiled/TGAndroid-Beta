package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final int f19997a;
    public final MessagesController f19998b;
    public final TLRPC.TL_error f19999c;
    public final long d;

    public ed(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f19997a = i10;
        this.f19998b = messagesController;
        this.f19999c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19997a) {
            case 0:
                this.f19998b.lambda$getChannelDifference$349(this.f19999c, this.d);
                return;
            default:
                this.f19998b.lambda$loadFullChat$67(this.f19999c, this.d);
                return;
        }
    }
}
