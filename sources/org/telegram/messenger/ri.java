package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f18918a;
    public final SendMessagesHelper f18919b;
    public final TLRPC.Message f18920c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f18918a = i11;
        this.f18919b = sendMessagesHelper;
        this.f18920c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18918a) {
            case 0:
                this.f18919b.lambda$performSendMessageRequest$102(this.f18920c, this.d);
                return;
            default:
                this.f18919b.lambda$sendMessage$15(this.f18920c, this.d);
                return;
        }
    }
}
