package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f15675a;
    public final SendMessagesHelper f15676b;
    public final TLRPC.Updates f15677c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15675a = i10;
        this.f15676b = sendMessagesHelper;
        this.f15677c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15675a) {
            case 0:
                this.f15676b.lambda$performSendMessageRequest$94(this.f15677c);
                return;
            default:
                this.f15676b.lambda$performSendMessageRequestMulti$72(this.f15677c);
                return;
        }
    }
}
