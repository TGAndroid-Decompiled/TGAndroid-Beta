package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f18528a;
    public final MessagesController f18529b;
    public final TLRPC.TL_error f18530c;
    public final long d;

    public he(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18528a = i10;
        this.f18529b = messagesController;
        this.f18530c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18528a) {
            case 0:
                this.f18529b.lambda$loadFullChat$67(this.f18530c, this.d);
                return;
            default:
                this.f18529b.lambda$getChannelDifference$347(this.f18530c, this.d);
                return;
        }
    }
}
