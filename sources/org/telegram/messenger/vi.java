package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f20305a;
    public final SendMessagesHelper f20306b;
    public final TLRPC.Message f20307c;
    public final int d;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f20305a = i11;
        this.f20306b = sendMessagesHelper;
        this.f20307c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20305a) {
            case 0:
                this.f20306b.lambda$performSendMessageRequest$102(this.f20307c, this.d);
                return;
            default:
                this.f20306b.lambda$sendMessage$15(this.f20307c, this.d);
                return;
        }
    }
}
