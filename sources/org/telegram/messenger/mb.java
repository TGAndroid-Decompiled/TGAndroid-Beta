package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f17009a;
    public final MessagesController f17010b;
    public final TLRPC.TL_error f17011c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17009a = i10;
        this.f17010b = messagesController;
        this.f17011c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17009a) {
            case 0:
                this.f17010b.lambda$loadFullChat$68(this.f17011c, this.d);
                return;
            default:
                this.f17010b.lambda$getChannelDifference$348(this.f17011c, this.d);
                return;
        }
    }
}
