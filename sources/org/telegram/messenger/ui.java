package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f18607a;
    public final SendMessagesHelper f18608b;
    public final TLRPC.Message f18609c;
    public final int d;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f18607a = i11;
        this.f18608b = sendMessagesHelper;
        this.f18609c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18607a) {
            case 0:
                this.f18608b.lambda$performSendMessageRequest$102(this.f18609c, this.d);
                return;
            default:
                this.f18608b.lambda$sendMessage$15(this.f18609c, this.d);
                return;
        }
    }
}
