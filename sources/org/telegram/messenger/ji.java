package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f18079a;
    public final SendMessagesHelper f18080b;
    public final TLRPC.Updates f18081c;
    public final TLRPC.Message d;
    public final boolean f18082e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18079a = i10;
        this.f18080b = sendMessagesHelper;
        this.f18081c = updates;
        this.d = message;
        this.f18082e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18079a) {
            case 0:
                this.f18080b.lambda$performSendMessageRequest$88(this.f18081c, this.d, this.f18082e);
                return;
            default:
                this.f18080b.lambda$performSendMessageRequest$85(this.f18081c, this.d, this.f18082e);
                return;
        }
    }
}
