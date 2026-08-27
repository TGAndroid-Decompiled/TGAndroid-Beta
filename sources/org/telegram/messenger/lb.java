package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class lb implements Runnable {

    public final int f20866a;

    public final MessagesController f20867b;

    public final TLRPC.TL_error f20868c;
    public final long d;

    public lb(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f20866a = i10;
        this.f20867b = messagesController;
        this.f20868c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20866a) {
            case 0:
                this.f20867b.lambda$loadFullChat$68(this.f20868c, this.d);
                break;
            default:
                this.f20867b.lambda$getChannelDifference$348(this.f20868c, this.d);
                break;
        }
    }
}
