package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f14727a;
    public final SendMessagesHelper f14728b;
    public final TLRPC.Message f14729c;
    public final int d;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f14727a = i11;
        this.f14728b = sendMessagesHelper;
        this.f14729c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f14727a) {
            case 0:
                this.f14728b.lambda$performSendMessageRequest$102(this.f14729c, this.d);
                return;
            default:
                this.f14728b.lambda$sendMessage$15(this.f14729c, this.d);
                return;
        }
    }
}
