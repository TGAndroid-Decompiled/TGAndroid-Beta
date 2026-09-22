package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f17325a;
    public final SendMessagesHelper f17326b;
    public final TLRPC.Message f17327c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17325a = i11;
        this.f17326b = sendMessagesHelper;
        this.f17327c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17325a) {
            case 0:
                this.f17326b.lambda$performSendMessageRequest$102(this.f17327c, this.d);
                return;
            default:
                this.f17326b.lambda$sendMessage$15(this.f17327c, this.d);
                return;
        }
    }
}
