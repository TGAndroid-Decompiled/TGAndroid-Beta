package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17483a;
    public final SendMessagesHelper f17484b;
    public final TLRPC.Message f17485c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17483a = i11;
        this.f17484b = sendMessagesHelper;
        this.f17485c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17483a) {
            case 0:
                this.f17484b.lambda$performSendMessageRequest$102(this.f17485c, this.d);
                return;
            default:
                this.f17484b.lambda$sendMessage$15(this.f17485c, this.d);
                return;
        }
    }
}
