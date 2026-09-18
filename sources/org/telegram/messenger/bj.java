package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f15789a;
    public final SendMessagesHelper f15790b;
    public final TLRPC.Updates f15791c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15789a = i10;
        this.f15790b = sendMessagesHelper;
        this.f15791c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15789a) {
            case 0:
                this.f15790b.lambda$performSendMessageRequest$94(this.f15791c);
                return;
            default:
                this.f15790b.lambda$performSendMessageRequestMulti$72(this.f15791c);
                return;
        }
    }
}
