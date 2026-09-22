package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f16018a;
    public final SendMessagesHelper f16019b;
    public final TLRPC.Updates f16020c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f16018a = i10;
        this.f16019b = sendMessagesHelper;
        this.f16020c = updates;
    }

    @Override
    public final void run() {
        switch (this.f16018a) {
            case 0:
                this.f16019b.lambda$performSendMessageRequest$94(this.f16020c);
                return;
            default:
                this.f16019b.lambda$performSendMessageRequestMulti$72(this.f16020c);
                return;
        }
    }
}
