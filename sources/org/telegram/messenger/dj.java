package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f16207a;
    public final SendMessagesHelper f16208b;
    public final TLRPC.Message f16209c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16207a = i10;
        this.f16208b = sendMessagesHelper;
        this.f16209c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16207a) {
            case 0:
                this.f16208b.lambda$putToSendingMessages$61(this.f16209c, this.d);
                return;
            case 1:
                this.f16208b.lambda$performSendMessageRequest$84(this.f16209c, this.d);
                return;
            default:
                this.f16208b.lambda$performSendMessageRequest$87(this.f16209c, this.d);
                return;
        }
    }
}
