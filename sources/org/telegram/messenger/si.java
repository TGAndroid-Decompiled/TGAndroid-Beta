package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f19530a;
    public final SendMessagesHelper f19531b;
    public final TLRPC.Message f19532c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19530a = i11;
        this.f19531b = sendMessagesHelper;
        this.f19532c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19530a) {
            case 0:
                this.f19531b.lambda$performSendMessageRequest$105(this.f19532c, this.d);
                return;
            default:
                this.f19531b.lambda$sendMessage$18(this.f19532c, this.d);
                return;
        }
    }
}
