package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lb implements Runnable {
    public final int f18313a;
    public final MessagesController f18314b;
    public final TLRPC.TL_error f18315c;
    public final long d;

    public lb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18313a = i10;
        this.f18314b = messagesController;
        this.f18315c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18313a) {
            case 0:
                this.f18314b.lambda$loadFullChat$68(this.f18315c, this.d);
                return;
            default:
                this.f18314b.lambda$getChannelDifference$348(this.f18315c, this.d);
                return;
        }
    }
}
