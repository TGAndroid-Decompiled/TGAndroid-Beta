package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f16133a;
    public final SendMessagesHelper f16134b;
    public final TLRPC.Message f16135c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16133a = i10;
        this.f16134b = sendMessagesHelper;
        this.f16135c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16133a) {
            case 0:
                this.f16134b.lambda$putToSendingMessages$61(this.f16135c, this.d);
                return;
            case 1:
                this.f16134b.lambda$performSendMessageRequest$84(this.f16135c, this.d);
                return;
            default:
                this.f16134b.lambda$performSendMessageRequest$87(this.f16135c, this.d);
                return;
        }
    }
}
