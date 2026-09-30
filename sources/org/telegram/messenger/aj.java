package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f15944a;
    public final SendMessagesHelper f15945b;
    public final TLRPC.Updates f15946c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15944a = i10;
        this.f15945b = sendMessagesHelper;
        this.f15946c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15944a) {
            case 0:
                this.f15945b.lambda$performSendMessageRequest$94(this.f15946c);
                return;
            default:
                this.f15945b.lambda$performSendMessageRequestMulti$72(this.f15946c);
                return;
        }
    }
}
