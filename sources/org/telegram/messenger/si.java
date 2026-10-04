package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f19173a;
    public final SendMessagesHelper f19174b;
    public final TLRPC.Message f19175c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19173a = i11;
        this.f19174b = sendMessagesHelper;
        this.f19175c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19173a) {
            case 0:
                this.f19174b.lambda$performSendMessageRequest$102(this.f19175c, this.d);
                return;
            default:
                this.f19174b.lambda$sendMessage$15(this.f19175c, this.d);
                return;
        }
    }
}
