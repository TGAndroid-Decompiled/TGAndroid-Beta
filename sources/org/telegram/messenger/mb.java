package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f17008a;
    public final MessagesController f17009b;
    public final TLRPC.TL_error f17010c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17008a = i10;
        this.f17009b = messagesController;
        this.f17010c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17008a) {
            case 0:
                this.f17009b.lambda$loadFullChat$68(this.f17010c, this.d);
                return;
            default:
                this.f17009b.lambda$getChannelDifference$348(this.f17010c, this.d);
                return;
        }
    }
}
