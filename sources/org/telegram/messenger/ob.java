package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ob implements Runnable {
    public final int f19554a;
    public final MessagesController f19555b;
    public final TLRPC.TL_error f19556c;
    public final long d;

    public ob(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f19554a = i10;
        this.f19555b = messagesController;
        this.f19556c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19554a) {
            case 0:
                this.f19555b.lambda$loadFullChat$68(this.f19556c, this.d);
                return;
            default:
                this.f19555b.lambda$getChannelDifference$348(this.f19556c, this.d);
                return;
        }
    }
}
