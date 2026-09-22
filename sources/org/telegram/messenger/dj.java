package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f15979a;
    public final SendMessagesHelper f15980b;
    public final TLRPC.Message f15981c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f15979a = i10;
        this.f15980b = sendMessagesHelper;
        this.f15981c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f15979a) {
            case 0:
                this.f15980b.lambda$putToSendingMessages$61(this.f15981c, this.d);
                return;
            case 1:
                this.f15980b.lambda$performSendMessageRequest$84(this.f15981c, this.d);
                return;
            default:
                this.f15980b.lambda$performSendMessageRequest$87(this.f15981c, this.d);
                return;
        }
    }
}
