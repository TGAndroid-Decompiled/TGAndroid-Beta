package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f17115a;
    public final MessagesController f17116b;
    public final TLRPC.TL_error f17117c;
    public final long d;

    public he(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f17115a = i10;
        this.f17116b = messagesController;
        this.f17117c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17115a) {
            case 0:
                this.f17116b.lambda$loadFullChat$67(this.f17117c, this.d);
                return;
            default:
                this.f17116b.lambda$getChannelDifference$347(this.f17117c, this.d);
                return;
        }
    }
}
