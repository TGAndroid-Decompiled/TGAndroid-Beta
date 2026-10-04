package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f18569a;
    public final MessagesController f18570b;
    public final TLRPC.TL_error f18571c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18569a = i10;
        this.f18570b = messagesController;
        this.f18571c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18569a) {
            case 0:
                this.f18570b.lambda$loadFullChat$68(this.f18571c, this.d);
                return;
            default:
                this.f18570b.lambda$getChannelDifference$348(this.f18571c, this.d);
                return;
        }
    }
}
