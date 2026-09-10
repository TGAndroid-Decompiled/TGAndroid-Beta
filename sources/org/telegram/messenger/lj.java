package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f15725a;
    public final SendMessagesHelper f15726b;
    public final TLRPC.Message f15727c;
    public final boolean d;

    public lj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f15725a = i10;
        this.f15726b = sendMessagesHelper;
        this.f15727c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f15725a) {
            case 0:
                this.f15726b.lambda$putToSendingMessages$61(this.f15727c, this.d);
                return;
            case 1:
                this.f15726b.lambda$performSendMessageRequest$84(this.f15727c, this.d);
                return;
            default:
                this.f15726b.lambda$performSendMessageRequest$87(this.f15727c, this.d);
                return;
        }
    }
}
