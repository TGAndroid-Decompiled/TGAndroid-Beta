package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17232a;
    public final SendMessagesHelper f17233b;
    public final TLRPC.Message f17234c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17232a = i11;
        this.f17233b = sendMessagesHelper;
        this.f17234c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17232a) {
            case 0:
                this.f17233b.lambda$performSendMessageRequest$102(this.f17234c, this.d);
                return;
            default:
                this.f17233b.lambda$sendMessage$15(this.f17234c, this.d);
                return;
        }
    }
}
