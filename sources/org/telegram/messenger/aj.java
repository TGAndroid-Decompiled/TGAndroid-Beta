package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17360a;
    public final SendMessagesHelper f17361b;
    public final TLRPC.Updates f17362c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17360a = i10;
        this.f17361b = sendMessagesHelper;
        this.f17362c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17360a) {
            case 0:
                this.f17361b.lambda$performSendMessageRequest$94(this.f17362c);
                return;
            default:
                this.f17361b.lambda$performSendMessageRequestMulti$72(this.f17362c);
                return;
        }
    }
}
