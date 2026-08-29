package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hi implements Runnable {
    public final int f20475a;
    public final SendMessagesHelper f20476b;
    public final TLRPC.Updates f20477c;
    public final TLRPC.Message d;
    public final boolean f20478e;

    public hi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f20475a = i10;
        this.f20476b = sendMessagesHelper;
        this.f20477c = updates;
        this.d = message;
        this.f20478e = z10;
    }

    @Override
    public final void run() {
        switch (this.f20475a) {
            case 0:
                this.f20476b.lambda$performSendMessageRequest$88(this.f20477c, this.d, this.f20478e);
                return;
            default:
                this.f20476b.lambda$performSendMessageRequest$85(this.f20477c, this.d, this.f20478e);
                return;
        }
    }
}
