package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f16751a;
    public final MessagesController f16752b;
    public final TLRPC.TL_error f16753c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16751a = i10;
        this.f16752b = messagesController;
        this.f16753c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16751a) {
            case 0:
                this.f16752b.lambda$loadFullChat$68(this.f16753c, this.d);
                return;
            default:
                this.f16752b.lambda$getChannelDifference$348(this.f16753c, this.d);
                return;
        }
    }
}
