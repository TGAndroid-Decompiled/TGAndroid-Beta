package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class de implements Runnable {
    public final int f18184a;
    public final MessagesController f18185b;
    public final TLRPC.TL_error f18186c;
    public final long d;

    public de(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18184a = i10;
        this.f18185b = messagesController;
        this.f18186c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18184a) {
            case 0:
                this.f18185b.lambda$loadFullChat$67(this.f18186c, this.d);
                return;
            default:
                this.f18185b.lambda$getChannelDifference$347(this.f18186c, this.d);
                return;
        }
    }
}
