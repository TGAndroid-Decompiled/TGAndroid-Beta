package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f15982a;
    public final SendMessagesHelper f15983b;
    public final TLRPC.Message f15984c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f15982a = i10;
        this.f15983b = sendMessagesHelper;
        this.f15984c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f15982a) {
            case 0:
                this.f15983b.lambda$putToSendingMessages$61(this.f15984c, this.d);
                return;
            case 1:
                this.f15983b.lambda$performSendMessageRequest$84(this.f15984c, this.d);
                return;
            default:
                this.f15983b.lambda$performSendMessageRequest$87(this.f15984c, this.d);
                return;
        }
    }
}
