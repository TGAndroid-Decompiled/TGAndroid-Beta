package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f16746a;
    public final SendMessagesHelper f16747b;
    public final TLRPC.Updates f16748c;
    public final TLRPC.Message d;
    public final boolean e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16746a = i10;
        this.f16747b = sendMessagesHelper;
        this.f16748c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16746a) {
            case 0:
                this.f16747b.lambda$performSendMessageRequest$88(this.f16748c, this.d, this.e);
                return;
            default:
                this.f16747b.lambda$performSendMessageRequest$85(this.f16748c, this.d, this.e);
                return;
        }
    }
}
