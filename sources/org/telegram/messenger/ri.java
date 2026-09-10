package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f16243a;
    public final SendMessagesHelper f16244b;
    public final TLRPC.Updates f16245c;
    public final TLRPC.Message d;
    public final boolean e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16243a = i10;
        this.f16244b = sendMessagesHelper;
        this.f16245c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16243a) {
            case 0:
                this.f16244b.lambda$performSendMessageRequest$88(this.f16245c, this.d, this.e);
                return;
            default:
                this.f16244b.lambda$performSendMessageRequest$85(this.f16245c, this.d, this.e);
                return;
        }
    }
}
