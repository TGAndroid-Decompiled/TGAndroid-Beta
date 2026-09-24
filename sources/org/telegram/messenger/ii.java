package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f16648a;
    public final SendMessagesHelper f16649b;
    public final TLRPC.Updates f16650c;
    public final TLRPC.Message d;
    public final boolean e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16648a = i10;
        this.f16649b = sendMessagesHelper;
        this.f16650c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16648a) {
            case 0:
                this.f16649b.lambda$performSendMessageRequest$88(this.f16650c, this.d, this.e);
                return;
            default:
                this.f16649b.lambda$performSendMessageRequest$85(this.f16650c, this.d, this.e);
                return;
        }
    }
}
