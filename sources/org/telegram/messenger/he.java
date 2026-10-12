package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f17418a;
    public final MessagesController f17419b;
    public final TLRPC.TL_error f17420c;
    public final long d;

    public he(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f17418a = i10;
        this.f17419b = messagesController;
        this.f17420c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17418a) {
            case 0:
                this.f17419b.lambda$loadFullChat$67(this.f17420c, this.d);
                return;
            default:
                this.f17419b.lambda$getChannelDifference$347(this.f17420c, this.d);
                return;
        }
    }
}
