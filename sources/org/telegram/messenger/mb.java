package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f16753a;
    public final MessagesController f16754b;
    public final TLRPC.TL_error f16755c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16753a = i10;
        this.f16754b = messagesController;
        this.f16755c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16753a) {
            case 0:
                this.f16754b.lambda$loadFullChat$68(this.f16755c, this.d);
                return;
            default:
                this.f16754b.lambda$getChannelDifference$348(this.f16755c, this.d);
                return;
        }
    }
}
