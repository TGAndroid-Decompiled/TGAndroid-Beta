package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f16148a;
    public final SendMessagesHelper f16149b;
    public final TLRPC.Message f16150c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16148a = i10;
        this.f16149b = sendMessagesHelper;
        this.f16150c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16148a) {
            case 0:
                this.f16149b.lambda$putToSendingMessages$61(this.f16150c, this.d);
                return;
            case 1:
                this.f16149b.lambda$performSendMessageRequest$84(this.f16150c, this.d);
                return;
            default:
                this.f16149b.lambda$performSendMessageRequest$87(this.f16150c, this.d);
                return;
        }
    }
}
