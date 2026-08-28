package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hb implements Runnable {
    public final int f20484a;
    public final MessagesController f20485b;
    public final TLRPC.TL_error f20486c;
    public final long d;

    public hb(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i9) {
        this.f20484a = i9;
        this.f20485b = messagesController;
        this.f20486c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20484a) {
            case 0:
                this.f20485b.lambda$loadFullChat$68(this.f20486c, this.d);
                return;
            default:
                this.f20485b.lambda$getChannelDifference$348(this.f20486c, this.d);
                return;
        }
    }
}
