package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nb implements Runnable {
    public final int f21054a;
    public final MessagesController f21055b;
    public final TLRPC.TL_error f21056c;
    public final long d;

    public nb(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f21054a = i10;
        this.f21055b = messagesController;
        this.f21056c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21054a) {
            case 0:
                this.f21055b.lambda$loadFullChat$68(this.f21056c, this.d);
                return;
            default:
                this.f21055b.lambda$getChannelDifference$348(this.f21056c, this.d);
                return;
        }
    }
}
