package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f20303a;
    public final SendMessagesHelper f20304b;
    public final TLRPC.Message f20305c;
    public final int d;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f20303a = i11;
        this.f20304b = sendMessagesHelper;
        this.f20305c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20303a) {
            case 0:
                this.f20304b.lambda$performSendMessageRequest$102(this.f20305c, this.d);
                return;
            default:
                this.f20304b.lambda$sendMessage$15(this.f20305c, this.d);
                return;
        }
    }
}
