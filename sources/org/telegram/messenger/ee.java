package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ee implements Runnable {
    public final int f17756a;
    public final MessagesController f17757b;
    public final TLRPC.TL_error f17758c;
    public final long d;

    public ee(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17756a = i10;
        this.f17757b = messagesController;
        this.f17758c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17756a) {
            case 0:
                this.f17757b.lambda$loadFullChat$67(this.f17758c, this.d);
                return;
            default:
                this.f17757b.lambda$getChannelDifference$347(this.f17758c, this.d);
                return;
        }
    }
}
