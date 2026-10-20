package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ee implements Runnable {
    public final int f18280a;
    public final MessagesController f18281b;
    public final TLRPC.TL_error f18282c;
    public final long d;

    public ee(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18280a = i10;
        this.f18281b = messagesController;
        this.f18282c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                this.f18281b.lambda$loadFullChat$67(this.f18282c, this.d);
                return;
            default:
                this.f18281b.lambda$getChannelDifference$347(this.f18282c, this.d);
                return;
        }
    }
}
