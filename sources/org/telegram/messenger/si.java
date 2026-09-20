package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f17543a;
    public final SendMessagesHelper f17544b;
    public final TLRPC.Message f17545c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f17543a = i11;
        this.f17544b = sendMessagesHelper;
        this.f17545c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17543a) {
            case 0:
                this.f17544b.lambda$performSendMessageRequest$102(this.f17545c, this.d);
                return;
            default:
                this.f17544b.lambda$sendMessage$15(this.f17545c, this.d);
                return;
        }
    }
}
