package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f19456a;
    public final SendMessagesHelper f19457b;
    public final TLRPC.Message f19458c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19456a = i11;
        this.f19457b = sendMessagesHelper;
        this.f19458c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19456a) {
            case 0:
                this.f19457b.lambda$performSendMessageRequest$105(this.f19458c, this.d);
                return;
            default:
                this.f19457b.lambda$sendMessage$18(this.f19458c, this.d);
                return;
        }
    }
}
