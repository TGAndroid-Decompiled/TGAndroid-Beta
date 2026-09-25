package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f15930a;
    public final SendMessagesHelper f15931b;
    public final TLRPC.Updates f15932c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15930a = i10;
        this.f15931b = sendMessagesHelper;
        this.f15932c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15930a) {
            case 0:
                this.f15931b.lambda$performSendMessageRequest$94(this.f15932c);
                return;
            default:
                this.f15931b.lambda$performSendMessageRequestMulti$72(this.f15932c);
                return;
        }
    }
}
