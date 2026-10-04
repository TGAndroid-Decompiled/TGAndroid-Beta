package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17597a;
    public final SendMessagesHelper f17598b;
    public final TLRPC.Message f17599c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17597a = i10;
        this.f17598b = sendMessagesHelper;
        this.f17599c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17597a) {
            case 0:
                this.f17598b.lambda$putToSendingMessages$61(this.f17599c, this.d);
                return;
            case 1:
                this.f17598b.lambda$performSendMessageRequest$84(this.f17599c, this.d);
                return;
            default:
                this.f17598b.lambda$performSendMessageRequest$87(this.f17599c, this.d);
                return;
        }
    }
}
