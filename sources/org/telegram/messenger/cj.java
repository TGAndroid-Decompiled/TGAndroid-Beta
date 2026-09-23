package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f15890a;
    public final SendMessagesHelper f15891b;
    public final TLRPC.Message f15892c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f15890a = i10;
        this.f15891b = sendMessagesHelper;
        this.f15892c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f15890a) {
            case 0:
                this.f15891b.lambda$putToSendingMessages$61(this.f15892c, this.d);
                return;
            case 1:
                this.f15891b.lambda$performSendMessageRequest$84(this.f15892c, this.d);
                return;
            default:
                this.f15891b.lambda$performSendMessageRequest$87(this.f15892c, this.d);
                return;
        }
    }
}
