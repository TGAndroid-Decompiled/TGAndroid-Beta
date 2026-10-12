package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wi implements Runnable {
    public final int f18943a;
    public final SendMessagesHelper f18944b;
    public final TLRPC.Message f18945c;
    public final int d;

    public wi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f18943a = i11;
        this.f18944b = sendMessagesHelper;
        this.f18945c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18943a) {
            case 0:
                this.f18944b.lambda$performSendMessageRequest$105(this.f18945c, this.d);
                return;
            default:
                this.f18944b.lambda$sendMessage$18(this.f18945c, this.d);
                return;
        }
    }
}
