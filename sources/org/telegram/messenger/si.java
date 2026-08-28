package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f21505a;
    public final SendMessagesHelper f21506b;
    public final TLRPC.Updates f21507c;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i9) {
        this.f21505a = i9;
        this.f21506b = sendMessagesHelper;
        this.f21507c = updates;
    }

    @Override
    public final void run() {
        switch (this.f21505a) {
            case 0:
                this.f21506b.lambda$performSendMessageRequest$94(this.f21507c);
                return;
            default:
                this.f21506b.lambda$performSendMessageRequestMulti$72(this.f21507c);
                return;
        }
    }
}
