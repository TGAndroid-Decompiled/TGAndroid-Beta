package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f19525a;
    public final SendMessagesHelper f19526b;
    public final TLRPC.Message f19527c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19525a = i11;
        this.f19526b = sendMessagesHelper;
        this.f19527c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19525a) {
            case 0:
                this.f19526b.lambda$performSendMessageRequest$105(this.f19527c, this.d);
                return;
            default:
                this.f19526b.lambda$sendMessage$18(this.f19527c, this.d);
                return;
        }
    }
}
