package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi implements Runnable {
    public final int f19286a;
    public final SendMessagesHelper f19287b;
    public final TLRPC.Message f19288c;
    public final int d;

    public pi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19286a = i11;
        this.f19287b = sendMessagesHelper;
        this.f19288c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19286a) {
            case 0:
                this.f19287b.lambda$performSendMessageRequest$105(this.f19288c, this.d);
                return;
            default:
                this.f19287b.lambda$sendMessage$18(this.f19288c, this.d);
                return;
        }
    }
}
