package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17226a;
    public final SendMessagesHelper f17227b;
    public final TLRPC.Updates f17228c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17226a = i10;
        this.f17227b = sendMessagesHelper;
        this.f17228c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17226a) {
            case 0:
                this.f17227b.lambda$performSendMessageRequest$94(this.f17228c);
                return;
            default:
                this.f17227b.lambda$performSendMessageRequestMulti$72(this.f17228c);
                return;
        }
    }
}
