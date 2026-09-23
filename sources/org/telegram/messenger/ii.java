package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f16402a;
    public final SendMessagesHelper f16403b;
    public final TLRPC.Updates f16404c;
    public final TLRPC.Message d;
    public final boolean e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16402a = i10;
        this.f16403b = sendMessagesHelper;
        this.f16404c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16402a) {
            case 0:
                this.f16403b.lambda$performSendMessageRequest$88(this.f16404c, this.d, this.e);
                return;
            default:
                this.f16403b.lambda$performSendMessageRequest$85(this.f16404c, this.d, this.e);
                return;
        }
    }
}
