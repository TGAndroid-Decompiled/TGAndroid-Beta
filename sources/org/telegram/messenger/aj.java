package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17199a;
    public final SendMessagesHelper f17200b;
    public final TLRPC.Updates f17201c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17199a = i10;
        this.f17200b = sendMessagesHelper;
        this.f17201c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17199a) {
            case 0:
                this.f17200b.lambda$performSendMessageRequest$94(this.f17201c);
                return;
            default:
                this.f17200b.lambda$performSendMessageRequestMulti$72(this.f17201c);
                return;
        }
    }
}
