package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17465a;
    public final SendMessagesHelper f17466b;
    public final TLRPC.Message f17467c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17465a = i11;
        this.f17466b = sendMessagesHelper;
        this.f17467c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17465a) {
            case 0:
                this.f17466b.lambda$performSendMessageRequest$102(this.f17467c, this.d);
                return;
            default:
                this.f17466b.lambda$sendMessage$15(this.f17467c, this.d);
                return;
        }
    }
}
