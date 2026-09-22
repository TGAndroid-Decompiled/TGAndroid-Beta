package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f17558a;
    public final SendMessagesHelper f17559b;
    public final TLRPC.Message f17560c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17558a = i11;
        this.f17559b = sendMessagesHelper;
        this.f17560c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17558a) {
            case 0:
                this.f17559b.lambda$performSendMessageRequest$102(this.f17560c, this.d);
                return;
            default:
                this.f17559b.lambda$sendMessage$15(this.f17560c, this.d);
                return;
        }
    }
}
