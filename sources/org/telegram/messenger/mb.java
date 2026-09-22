package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f16748a;
    public final MessagesController f16749b;
    public final TLRPC.TL_error f16750c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16748a = i10;
        this.f16749b = messagesController;
        this.f16750c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16748a) {
            case 0:
                this.f16749b.lambda$loadFullChat$68(this.f16750c, this.d);
                return;
            default:
                this.f16749b.lambda$getChannelDifference$348(this.f16750c, this.d);
                return;
        }
    }
}
