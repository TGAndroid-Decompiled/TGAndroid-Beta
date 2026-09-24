package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f16994a;
    public final MessagesController f16995b;
    public final TLRPC.TL_error f16996c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16994a = i10;
        this.f16995b = messagesController;
        this.f16996c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16994a) {
            case 0:
                this.f16995b.lambda$loadFullChat$68(this.f16996c, this.d);
                return;
            default:
                this.f16995b.lambda$getChannelDifference$348(this.f16996c, this.d);
                return;
        }
    }
}
