package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f18570a;
    public final MessagesController f18571b;
    public final TLRPC.TL_error f18572c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18570a = i10;
        this.f18571b = messagesController;
        this.f18572c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18570a) {
            case 0:
                this.f18571b.lambda$loadFullChat$68(this.f18572c, this.d);
                return;
            default:
                this.f18571b.lambda$getChannelDifference$348(this.f18572c, this.d);
                return;
        }
    }
}
