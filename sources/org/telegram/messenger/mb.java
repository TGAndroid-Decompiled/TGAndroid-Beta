package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f16979a;
    public final MessagesController f16980b;
    public final TLRPC.TL_error f16981c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16979a = i10;
        this.f16980b = messagesController;
        this.f16981c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16979a) {
            case 0:
                this.f16980b.lambda$loadFullChat$68(this.f16981c, this.d);
                return;
            default:
                this.f16980b.lambda$getChannelDifference$348(this.f16981c, this.d);
                return;
        }
    }
}
