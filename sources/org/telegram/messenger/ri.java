package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17500a;
    public final SendMessagesHelper f17501b;
    public final TLRPC.Message f17502c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17500a = i11;
        this.f17501b = sendMessagesHelper;
        this.f17502c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17500a) {
            case 0:
                this.f17501b.lambda$performSendMessageRequest$102(this.f17502c, this.d);
                return;
            default:
                this.f17501b.lambda$sendMessage$15(this.f17502c, this.d);
                return;
        }
    }
}
