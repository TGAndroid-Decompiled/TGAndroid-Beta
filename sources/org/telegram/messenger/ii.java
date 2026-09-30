package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f16684a;
    public final SendMessagesHelper f16685b;
    public final TLRPC.Updates f16686c;
    public final TLRPC.Message d;
    public final boolean e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16684a = i10;
        this.f16685b = sendMessagesHelper;
        this.f16686c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16684a) {
            case 0:
                this.f16685b.lambda$performSendMessageRequest$88(this.f16686c, this.d, this.e);
                return;
            default:
                this.f16685b.lambda$performSendMessageRequest$85(this.f16686c, this.d, this.e);
                return;
        }
    }
}
