package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f15991a;
    public final SendMessagesHelper f15992b;
    public final TLRPC.Message f15993c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f15991a = i10;
        this.f15992b = sendMessagesHelper;
        this.f15993c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f15991a) {
            case 0:
                this.f15992b.lambda$putToSendingMessages$61(this.f15993c, this.d);
                return;
            case 1:
                this.f15992b.lambda$performSendMessageRequest$84(this.f15993c, this.d);
                return;
            default:
                this.f15992b.lambda$performSendMessageRequest$87(this.f15993c, this.d);
                return;
        }
    }
}
