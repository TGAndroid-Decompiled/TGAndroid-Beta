package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f17303a;
    public final SendMessagesHelper f17304b;
    public final TLRPC.Updates f17305c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17303a = i10;
        this.f17304b = sendMessagesHelper;
        this.f17305c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17303a) {
            case 0:
                this.f17304b.lambda$performSendMessageRequest$94(this.f17305c);
                return;
            default:
                this.f17304b.lambda$performSendMessageRequestMulti$72(this.f17305c);
                return;
        }
    }
}
