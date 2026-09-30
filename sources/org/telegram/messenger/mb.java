package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f17025a;
    public final MessagesController f17026b;
    public final TLRPC.TL_error f17027c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17025a = i10;
        this.f17026b = messagesController;
        this.f17027c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17025a) {
            case 0:
                this.f17026b.lambda$loadFullChat$68(this.f17027c, this.d);
                return;
            default:
                this.f17026b.lambda$getChannelDifference$348(this.f17027c, this.d);
                return;
        }
    }
}
