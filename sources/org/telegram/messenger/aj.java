package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f15927a;
    public final SendMessagesHelper f15928b;
    public final TLRPC.Updates f15929c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15927a = i10;
        this.f15928b = sendMessagesHelper;
        this.f15929c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15927a) {
            case 0:
                this.f15928b.lambda$performSendMessageRequest$94(this.f15929c);
                return;
            default:
                this.f15928b.lambda$performSendMessageRequestMulti$72(this.f15929c);
                return;
        }
    }
}
