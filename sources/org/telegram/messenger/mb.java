package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f18565a;
    public final MessagesController f18566b;
    public final TLRPC.TL_error f18567c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18565a = i10;
        this.f18566b = messagesController;
        this.f18567c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18565a) {
            case 0:
                this.f18566b.lambda$loadFullChat$68(this.f18567c, this.d);
                return;
            default:
                this.f18566b.lambda$getChannelDifference$348(this.f18567c, this.d);
                return;
        }
    }
}
