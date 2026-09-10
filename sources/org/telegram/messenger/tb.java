package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f16396a;
    public final MessagesController f16397b;
    public final TLRPC.TL_error f16398c;
    public final long d;

    public tb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.f16396a = i10;
        this.f16397b = messagesController;
        this.f16398c = tL_error;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16396a) {
            case 0:
                this.f16397b.lambda$loadFullChat$68(this.f16398c, this.d);
                return;
            default:
                this.f16397b.lambda$getChannelDifference$348(this.f16398c, this.d);
                return;
        }
    }
}
