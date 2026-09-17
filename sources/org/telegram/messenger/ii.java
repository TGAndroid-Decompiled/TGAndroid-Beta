package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f17999a;
    public final SendMessagesHelper f18000b;
    public final TLRPC.Updates f18001c;
    public final TLRPC.Message d;
    public final boolean f18002e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f17999a = i10;
        this.f18000b = sendMessagesHelper;
        this.f18001c = updates;
        this.d = message;
        this.f18002e = z10;
    }

    @Override
    public final void run() {
        switch (this.f17999a) {
            case 0:
                this.f18000b.lambda$performSendMessageRequest$88(this.f18001c, this.d, this.f18002e);
                return;
            default:
                this.f18000b.lambda$performSendMessageRequest$85(this.f18001c, this.d, this.f18002e);
                return;
        }
    }
}
