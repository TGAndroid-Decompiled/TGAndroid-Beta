package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f18783a;
    public final SendMessagesHelper f18784b;
    public final TLRPC.Message f18785c;
    public final boolean d;

    public gj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z4, int i10) {
        this.f18783a = i10;
        this.f18784b = sendMessagesHelper;
        this.f18785c = message;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f18783a) {
            case 0:
                this.f18784b.lambda$putToSendingMessages$61(this.f18785c, this.d);
                return;
            case 1:
                this.f18784b.lambda$performSendMessageRequest$84(this.f18785c, this.d);
                return;
            default:
                this.f18784b.lambda$performSendMessageRequest$87(this.f18785c, this.d);
                return;
        }
    }
}
