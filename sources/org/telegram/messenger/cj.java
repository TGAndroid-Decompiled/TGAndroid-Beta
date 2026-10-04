package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17596a;
    public final SendMessagesHelper f17597b;
    public final TLRPC.Message f17598c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17596a = i10;
        this.f17597b = sendMessagesHelper;
        this.f17598c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17596a) {
            case 0:
                this.f17597b.lambda$putToSendingMessages$61(this.f17598c, this.d);
                return;
            case 1:
                this.f17597b.lambda$performSendMessageRequest$84(this.f17598c, this.d);
                return;
            default:
                this.f17597b.lambda$performSendMessageRequest$87(this.f17598c, this.d);
                return;
        }
    }
}
