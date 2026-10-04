package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17359a;
    public final SendMessagesHelper f17360b;
    public final TLRPC.Updates f17361c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17359a = i10;
        this.f17360b = sendMessagesHelper;
        this.f17361c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17359a) {
            case 0:
                this.f17360b.lambda$performSendMessageRequest$94(this.f17361c);
                return;
            default:
                this.f17360b.lambda$performSendMessageRequestMulti$72(this.f17361c);
                return;
        }
    }
}
