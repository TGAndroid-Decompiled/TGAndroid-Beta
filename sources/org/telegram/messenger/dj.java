package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f16222a;
    public final SendMessagesHelper f16223b;
    public final TLRPC.Message f16224c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16222a = i10;
        this.f16223b = sendMessagesHelper;
        this.f16224c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16222a) {
            case 0:
                this.f16223b.lambda$putToSendingMessages$61(this.f16224c, this.d);
                return;
            case 1:
                this.f16223b.lambda$performSendMessageRequest$84(this.f16224c, this.d);
                return;
            default:
                this.f16223b.lambda$performSendMessageRequest$87(this.f16224c, this.d);
                return;
        }
    }
}
