package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f18945a;
    public final SendMessagesHelper f18946b;
    public final TLRPC.Message f18947c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f18945a = i11;
        this.f18946b = sendMessagesHelper;
        this.f18947c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18945a) {
            case 0:
                this.f18946b.lambda$performSendMessageRequest$102(this.f18947c, this.d);
                return;
            default:
                this.f18946b.lambda$sendMessage$15(this.f18947c, this.d);
                return;
        }
    }
}
