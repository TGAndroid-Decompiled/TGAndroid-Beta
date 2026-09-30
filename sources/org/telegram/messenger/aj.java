package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f15928a;
    public final SendMessagesHelper f15929b;
    public final TLRPC.Updates f15930c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15928a = i10;
        this.f15929b = sendMessagesHelper;
        this.f15930c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15928a) {
            case 0:
                this.f15929b.lambda$performSendMessageRequest$94(this.f15930c);
                return;
            default:
                this.f15929b.lambda$performSendMessageRequestMulti$72(this.f15930c);
                return;
        }
    }
}
