package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ti implements Runnable {
    public final int f17592a;
    public final SendMessagesHelper f17593b;
    public final TLRPC.Message f17594c;
    public final int d;

    public ti(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17592a = i11;
        this.f17593b = sendMessagesHelper;
        this.f17594c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17592a) {
            case 0:
                this.f17593b.lambda$performSendMessageRequest$102(this.f17594c, this.d);
                return;
            default:
                this.f17593b.lambda$sendMessage$15(this.f17594c, this.d);
                return;
        }
    }
}
