package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f17801a;
    public final MessagesController f17802b;
    public final TLRPC.TL_error f17803c;
    public final long d;

    public he(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f17801a = i10;
        this.f17802b = messagesController;
        this.f17803c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17801a) {
            case 0:
                this.f17802b.lambda$loadFullChat$67(this.f17803c, this.d);
                return;
            default:
                this.f17802b.lambda$getChannelDifference$347(this.f17803c, this.d);
                return;
        }
    }
}
