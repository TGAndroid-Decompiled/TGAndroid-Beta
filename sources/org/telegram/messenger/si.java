package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f17328a;
    public final SendMessagesHelper f17329b;
    public final TLRPC.Message f17330c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17328a = i11;
        this.f17329b = sendMessagesHelper;
        this.f17330c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17328a) {
            case 0:
                this.f17329b.lambda$performSendMessageRequest$102(this.f17330c, this.d);
                return;
            default:
                this.f17329b.lambda$sendMessage$15(this.f17330c, this.d);
                return;
        }
    }
}
