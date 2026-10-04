package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f19093a;
    public final SendMessagesHelper f19094b;
    public final TLRPC.Message f19095c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19093a = i11;
        this.f19094b = sendMessagesHelper;
        this.f19095c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19093a) {
            case 0:
                this.f19094b.lambda$performSendMessageRequest$102(this.f19095c, this.d);
                return;
            default:
                this.f19094b.lambda$sendMessage$15(this.f19095c, this.d);
                return;
        }
    }
}
