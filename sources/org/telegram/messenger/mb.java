package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f18363a;
    public final MessagesController f18364b;
    public final TLRPC.TL_error f18365c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18363a = i10;
        this.f18364b = messagesController;
        this.f18365c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18363a) {
            case 0:
                this.f18364b.lambda$loadFullChat$68(this.f18365c, this.d);
                return;
            default:
                this.f18364b.lambda$getChannelDifference$348(this.f18365c, this.d);
                return;
        }
    }
}
