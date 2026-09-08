package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f19024a;
    public final SendMessagesHelper f19025b;
    public final TLRPC.Message f19026c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19024a = i11;
        this.f19025b = sendMessagesHelper;
        this.f19026c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19024a) {
            case 0:
                this.f19025b.lambda$performSendMessageRequest$102(this.f19026c, this.d);
                return;
            default:
                this.f19025b.lambda$sendMessage$15(this.f19026c, this.d);
                return;
        }
    }
}
