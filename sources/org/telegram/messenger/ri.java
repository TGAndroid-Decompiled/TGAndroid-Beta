package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17484a;
    public final SendMessagesHelper f17485b;
    public final TLRPC.Message f17486c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17484a = i11;
        this.f17485b = sendMessagesHelper;
        this.f17486c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17484a) {
            case 0:
                this.f17485b.lambda$performSendMessageRequest$102(this.f17486c, this.d);
                return;
            default:
                this.f17485b.lambda$sendMessage$15(this.f17486c, this.d);
                return;
        }
    }
}
