package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ob implements Runnable {
    public final int f18012a;
    public final MessagesController f18013b;
    public final TLRPC.TL_error f18014c;
    public final long d;

    public ob(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.f18012a = i10;
        this.f18013b = messagesController;
        this.f18014c = tL_error;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18012a) {
            case 0:
                this.f18013b.lambda$loadFullChat$68(this.f18014c, this.d);
                return;
            default:
                this.f18013b.lambda$getChannelDifference$348(this.f18014c, this.d);
                return;
        }
    }
}
