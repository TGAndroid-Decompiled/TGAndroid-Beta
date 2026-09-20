package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f16731a;
    public final SendMessagesHelper f16732b;
    public final TLRPC.Updates f16733c;
    public final TLRPC.Message d;
    public final boolean e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16731a = i10;
        this.f16732b = sendMessagesHelper;
        this.f16733c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16731a) {
            case 0:
                this.f16732b.lambda$performSendMessageRequest$88(this.f16733c, this.d, this.e);
                return;
            default:
                this.f16732b.lambda$performSendMessageRequest$85(this.f16733c, this.d, this.e);
                return;
        }
    }
}
