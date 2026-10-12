package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f17802a;
    public final MessagesController f17803b;
    public final TLRPC.TL_error f17804c;
    public final long d;

    public he(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17802a = i10;
        this.f17803b = messagesController;
        this.f17804c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17802a) {
            case 0:
                this.f17803b.lambda$loadFullChat$67(this.f17804c, this.d);
                return;
            default:
                this.f17803b.lambda$getChannelDifference$347(this.f17804c, this.d);
                return;
        }
    }
}
