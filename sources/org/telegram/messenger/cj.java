package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f16142a;
    public final SendMessagesHelper f16143b;
    public final TLRPC.Message f16144c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16142a = i10;
        this.f16143b = sendMessagesHelper;
        this.f16144c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16142a) {
            case 0:
                this.f16143b.lambda$putToSendingMessages$61(this.f16144c, this.d);
                return;
            case 1:
                this.f16143b.lambda$performSendMessageRequest$84(this.f16144c, this.d);
                return;
            default:
                this.f16143b.lambda$performSendMessageRequest$87(this.f16144c, this.d);
                return;
        }
    }
}
