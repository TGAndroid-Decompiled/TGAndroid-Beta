package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f19599a;
    public final SendMessagesHelper f19600b;
    public final TLRPC.Message f19601c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19599a = i11;
        this.f19600b = sendMessagesHelper;
        this.f19601c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19599a) {
            case 0:
                this.f19600b.lambda$performSendMessageRequest$105(this.f19601c, this.d);
                return;
            default:
                this.f19600b.lambda$sendMessage$18(this.f19601c, this.d);
                return;
        }
    }
}
