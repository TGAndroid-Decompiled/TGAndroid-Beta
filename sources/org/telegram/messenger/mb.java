package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f18568a;
    public final MessagesController f18569b;
    public final TLRPC.TL_error f18570c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18568a = i10;
        this.f18569b = messagesController;
        this.f18570c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18568a) {
            case 0:
                this.f18569b.lambda$loadFullChat$68(this.f18570c, this.d);
                return;
            default:
                this.f18569b.lambda$getChannelDifference$348(this.f18570c, this.d);
                return;
        }
    }
}
