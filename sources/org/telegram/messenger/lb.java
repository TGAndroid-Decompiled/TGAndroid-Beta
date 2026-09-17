package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lb implements Runnable {
    public final int f18286a;
    public final MessagesController f18287b;
    public final TLRPC.TL_error f18288c;
    public final long d;

    public lb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18286a = i10;
        this.f18287b = messagesController;
        this.f18288c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18286a) {
            case 0:
                this.f18287b.lambda$loadFullChat$68(this.f18288c, this.d);
                return;
            default:
                this.f18287b.lambda$getChannelDifference$348(this.f18288c, this.d);
                return;
        }
    }
}
