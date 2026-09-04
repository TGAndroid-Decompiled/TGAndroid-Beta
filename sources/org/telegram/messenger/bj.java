package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f17276a;
    public final SendMessagesHelper f17277b;
    public final TLRPC.Updates f17278c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17276a = i10;
        this.f17277b = sendMessagesHelper;
        this.f17278c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17276a) {
            case 0:
                this.f17277b.lambda$performSendMessageRequest$94(this.f17278c);
                return;
            default:
                this.f17277b.lambda$performSendMessageRequestMulti$72(this.f17278c);
                return;
        }
    }
}
