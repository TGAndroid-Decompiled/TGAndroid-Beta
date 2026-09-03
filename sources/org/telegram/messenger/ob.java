package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ob implements Runnable {
    public final int f19556a;
    public final MessagesController f19557b;
    public final TLRPC.TL_error f19558c;
    public final long d;

    public ob(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f19556a = i10;
        this.f19557b = messagesController;
        this.f19558c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19556a) {
            case 0:
                this.f19557b.lambda$loadFullChat$68(this.f19558c, this.d);
                return;
            default:
                this.f19557b.lambda$getChannelDifference$348(this.f19558c, this.d);
                return;
        }
    }
}
