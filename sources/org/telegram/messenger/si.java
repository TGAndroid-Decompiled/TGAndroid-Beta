package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f17337a;
    public final SendMessagesHelper f17338b;
    public final TLRPC.Message f17339c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17337a = i11;
        this.f17338b = sendMessagesHelper;
        this.f17339c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17337a) {
            case 0:
                this.f17338b.lambda$performSendMessageRequest$102(this.f17339c, this.d);
                return;
            default:
                this.f17338b.lambda$sendMessage$15(this.f17339c, this.d);
                return;
        }
    }
}
