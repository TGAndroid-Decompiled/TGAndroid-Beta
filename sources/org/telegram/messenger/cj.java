package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17585a;
    public final SendMessagesHelper f17586b;
    public final TLRPC.Message f17587c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17585a = i10;
        this.f17586b = sendMessagesHelper;
        this.f17587c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17585a) {
            case 0:
                this.f17586b.lambda$putToSendingMessages$64(this.f17587c, this.d);
                return;
            case 1:
                this.f17586b.lambda$performSendMessageRequest$90(this.f17587c, this.d);
                return;
            default:
                this.f17586b.lambda$performSendMessageRequest$87(this.f17587c, this.d);
                return;
        }
    }
}
