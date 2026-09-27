package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f15924a;
    public final SendMessagesHelper f15925b;
    public final TLRPC.Updates f15926c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15924a = i10;
        this.f15925b = sendMessagesHelper;
        this.f15926c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15924a) {
            case 0:
                this.f15925b.lambda$performSendMessageRequest$94(this.f15926c);
                return;
            default:
                this.f15925b.lambda$performSendMessageRequestMulti$72(this.f15926c);
                return;
        }
    }
}
