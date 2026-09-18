package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f16934a;
    public final MessagesController f16935b;
    public final TLRPC.TL_error f16936c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16934a = i10;
        this.f16935b = messagesController;
        this.f16936c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16934a) {
            case 0:
                this.f16935b.lambda$loadFullChat$68(this.f16936c, this.d);
                return;
            default:
                this.f16935b.lambda$getChannelDifference$348(this.f16936c, this.d);
                return;
        }
    }
}
