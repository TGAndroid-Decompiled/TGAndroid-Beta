package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f18396a;
    public final SendMessagesHelper f18397b;
    public final TLRPC.Message f18398c;
    public final int d;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f18396a = i11;
        this.f18397b = sendMessagesHelper;
        this.f18398c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18396a) {
            case 0:
                this.f18397b.lambda$performSendMessageRequest$105(this.f18398c, this.d);
                return;
            default:
                this.f18397b.lambda$sendMessage$18(this.f18398c, this.d);
                return;
        }
    }
}
