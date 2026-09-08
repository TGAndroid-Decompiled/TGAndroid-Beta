package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mb implements Runnable {
    public final int f18390a;
    public final MessagesController f18391b;
    public final TLRPC.TL_error f18392c;
    public final long d;

    public mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f18390a = i10;
        this.f18391b = messagesController;
        this.f18392c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18390a) {
            case 0:
                this.f18391b.lambda$loadFullChat$68(this.f18392c, this.d);
                return;
            default:
                this.f18391b.lambda$getChannelDifference$348(this.f18392c, this.d);
                return;
        }
    }
}
