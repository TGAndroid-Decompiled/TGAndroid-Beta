package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f16762a;
    public final MessagesController f16763b;
    public final TLRPC.TL_error f16764c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16762a = i10;
        this.f16763b = messagesController;
        this.f16764c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16762a) {
            case 0:
                this.f16763b.lambda$loadFullChat$68(this.f16764c, this.d);
                return;
            default:
                this.f16763b.lambda$getChannelDifference$348(this.f16764c, this.d);
                return;
        }
    }
}
