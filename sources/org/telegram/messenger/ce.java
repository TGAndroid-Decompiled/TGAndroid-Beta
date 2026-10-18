package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ce implements Runnable {
    public final int f18106a;
    public final MessagesController f18107b;
    public final TLRPC.TL_error f18108c;
    public final long d;

    public ce(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18106a = i10;
        this.f18107b = messagesController;
        this.f18108c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18106a) {
            case 0:
                this.f18107b.lambda$loadFullChat$67(this.f18108c, this.d);
                return;
            default:
                this.f18107b.lambda$getChannelDifference$347(this.f18108c, this.d);
                return;
        }
    }
}
