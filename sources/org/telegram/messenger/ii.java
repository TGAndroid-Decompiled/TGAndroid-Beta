package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f18026a;
    public final SendMessagesHelper f18027b;
    public final TLRPC.Updates f18028c;
    public final TLRPC.Message d;
    public final boolean f18029e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18026a = i10;
        this.f18027b = sendMessagesHelper;
        this.f18028c = updates;
        this.d = message;
        this.f18029e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18026a) {
            case 0:
                this.f18027b.lambda$performSendMessageRequest$88(this.f18028c, this.d, this.f18029e);
                return;
            default:
                this.f18027b.lambda$performSendMessageRequest$85(this.f18028c, this.d, this.f18029e);
                return;
        }
    }
}
