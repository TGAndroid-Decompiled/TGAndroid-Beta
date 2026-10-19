package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class de implements Runnable {
    public final int f18187a;
    public final MessagesController f18188b;
    public final TLRPC.TL_error f18189c;
    public final long d;

    public de(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18187a = i10;
        this.f18188b = messagesController;
        this.f18189c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18187a) {
            case 0:
                this.f18188b.lambda$loadFullChat$67(this.f18189c, this.d);
                return;
            default:
                this.f18188b.lambda$getChannelDifference$347(this.f18189c, this.d);
                return;
        }
    }
}
