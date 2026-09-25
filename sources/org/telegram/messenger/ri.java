package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17480a;
    public final SendMessagesHelper f17481b;
    public final TLRPC.Message f17482c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17480a = i11;
        this.f17481b = sendMessagesHelper;
        this.f17482c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17480a) {
            case 0:
                this.f17481b.lambda$performSendMessageRequest$102(this.f17482c, this.d);
                return;
            default:
                this.f17481b.lambda$sendMessage$15(this.f17482c, this.d);
                return;
        }
    }
}
