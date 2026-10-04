package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f18181a;
    public final SendMessagesHelper f18182b;
    public final TLRPC.Updates f18183c;
    public final TLRPC.Message d;
    public final boolean f18184e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18181a = i10;
        this.f18182b = sendMessagesHelper;
        this.f18183c = updates;
        this.d = message;
        this.f18184e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18181a) {
            case 0:
                this.f18182b.lambda$performSendMessageRequest$88(this.f18183c, this.d, this.f18184e);
                return;
            default:
                this.f18182b.lambda$performSendMessageRequest$85(this.f18183c, this.d, this.f18184e);
                return;
        }
    }
}
