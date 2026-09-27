package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f17003a;
    public final MessagesController f17004b;
    public final TLRPC.TL_error f17005c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17003a = i10;
        this.f17004b = messagesController;
        this.f17005c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17003a) {
            case 0:
                this.f17004b.lambda$loadFullChat$68(this.f17005c, this.d);
                return;
            default:
                this.f17004b.lambda$getChannelDifference$348(this.f17005c, this.d);
                return;
        }
    }
}
