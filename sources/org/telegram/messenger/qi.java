package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f21373a;
    public final SendMessagesHelper f21374b;
    public final TLRPC.Message f21375c;
    public final int d;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f21373a = i11;
        this.f21374b = sendMessagesHelper;
        this.f21375c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21373a) {
            case 0:
                this.f21374b.lambda$performSendMessageRequest$102(this.f21375c, this.d);
                return;
            default:
                this.f21374b.lambda$sendMessage$15(this.f21375c, this.d);
                return;
        }
    }
}
