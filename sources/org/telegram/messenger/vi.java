package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f21530a;
    public final SendMessagesHelper f21531b;
    public final TLRPC.Message f21532c;
    public final int d;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f21530a = i11;
        this.f21531b = sendMessagesHelper;
        this.f21532c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21530a) {
            case 0:
                this.f21531b.lambda$performSendMessageRequest$105(this.f21532c, this.d);
                return;
            default:
                this.f21531b.lambda$sendMessage$18(this.f21532c, this.d);
                return;
        }
    }
}
