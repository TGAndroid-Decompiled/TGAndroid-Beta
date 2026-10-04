package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f17466a;
    public final SendMessagesHelper f17467b;
    public final TLRPC.Updates f17468c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17466a = i10;
        this.f17467b = sendMessagesHelper;
        this.f17468c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17466a) {
            case 0:
                this.f17467b.lambda$performSendMessageRequest$94(this.f17468c);
                return;
            default:
                this.f17467b.lambda$performSendMessageRequestMulti$72(this.f17468c);
                return;
        }
    }
}
