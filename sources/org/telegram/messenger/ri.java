package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17474a;
    public final SendMessagesHelper f17475b;
    public final TLRPC.Message f17476c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17474a = i11;
        this.f17475b = sendMessagesHelper;
        this.f17476c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17474a) {
            case 0:
                this.f17475b.lambda$performSendMessageRequest$102(this.f17476c, this.d);
                return;
            default:
                this.f17475b.lambda$sendMessage$15(this.f17476c, this.d);
                return;
        }
    }
}
